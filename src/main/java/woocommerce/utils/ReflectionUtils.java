package woocommerce.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import woocommerce.annotation.JsonElement;
import woocommerce.annotation.JsonElementType;
import woocommerce.entity.product.ProductDimension;
import woocommerce.entity.product.ProductVariable;
import woocommerce.exception.CanNotSetNullFieldReflectUtilsException;

import java.lang.reflect.Field;
import java.util.*;

public class ReflectionUtils {
    private static final Logger LOG = Logger.getLogger(ReflectionUtils.class);
    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static List<Field> getAllFields(List<Field> fields, Class<?> clazz) {
        fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
        if (null != clazz.getSuperclass()) {
            getAllFields(fields, clazz.getSuperclass());
        }
        return fields;
    }

    public static ProductVariable jsonStringToProductVariable(String json) {
        ProductVariable productVariable = null;
        try {
            HashMap<Object, Object> result = MAPPER.readValue(json, HashMap.class);
            productVariable = new ProductVariable.Builder().init();
            List<Field> fields = getAllFields(new ArrayList<>(), ProductVariable.class);
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonElement.class)) {
                    String key = field.getAnnotation(JsonElement.class).key();
                    if (field.isAnnotationPresent(JsonElementType.class)) {
                        // We need to convert String to Integer
                        Integer prop = null;
                        if (result.get(field.getAnnotation(JsonElement.class).key()) instanceof String) {
                            prop = Integer.parseInt((String) result.get(field.getAnnotation(JsonElement.class).key()));
                        }
                        field.set(productVariable, prop);
                    } else {
                        try {
                            if (key.contains("date")) {
                                field.set(productVariable, DateTimeUtils.jsonDateStringToJavaDate(result.get(field.getAnnotation(JsonElement.class).key()).toString()));
                            } else if (key.contains("dimensions")) {
                                ProductDimension productDimension = new ProductDimension();
                                for (Field field1 : ProductDimension.class.getDeclaredFields()) {
                                    field1.setAccessible(true);
                                    LinkedHashMap<String, String> dimensions = null;
                                    if (result.get(field.getAnnotation(JsonElement.class).key()) instanceof LinkedHashMap) {
                                        dimensions = (LinkedHashMap) result.get(field.getAnnotation(JsonElement.class).key());
                                    }
                                    for (String k : dimensions.keySet()) {
                                        if (field1.getName().equals(k)) {
                                            field1.set(productDimension, dimensions.get(k));
                                        }
                                    }
                                }
                                field.set(productVariable, productDimension);
                            } else if (key.equals("backorders")) {
                                if (result.get(field.getAnnotation(JsonElement.class).key()).toString().equals("no")) {
                                    field.set(productVariable, false);
                                } else {
                                    field.set(productVariable, true);
                                }
                            } else {
                                field.set(productVariable, result.get(field.getAnnotation(JsonElement.class).key()));
                            }
                        } catch (Exception e) {
                            throw new CanNotSetNullFieldReflectUtilsException(String.format("Cannot set null key %s to object %s", key, field.getType().getName()), e.getCause());
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productVariable;
    }

}
