package woocommerce.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import woocommerce.annotation.JsonElement;
import woocommerce.annotation.TypeOfJsonElement;
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
                    TypeOfJsonElement typeOfElement = field.getAnnotation(JsonElement.class).type();
                    Object obj = result.get(key);

                    if (typeOfElement == TypeOfJsonElement.NONE) {
                        field.set(productVariable, obj);
                    }
                    else {
                        //need to cast to specific type
                        field.set(productVariable, typeOfElement.typeOfTargetClass.cast(convert(obj, typeOfElement)));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productVariable;
    }

    public static Object convert(Object obj, TypeOfJsonElement clazz) {
        Object prop = null;
        try {
            switch (clazz) {
                case NONE:
                    prop = obj;
                    break;
                case INTEGER:
                    prop = Integer.parseInt((String) obj);
                    break;
                case STRING:
                    prop = (String) obj;
                    break;
                case ISO8601_DATETIME:
                    prop = DateTimeUtils.jsonDateStringToJavaDate((String) obj);
                    break;
                case DIMENSION:
                    ProductDimension productDimension = new ProductDimension();
                    for (Field field1 : ProductDimension.class.getDeclaredFields()) {
                        field1.setAccessible(true);
                        LinkedHashMap<String, String> dimensions = null;
                        if (obj instanceof LinkedHashMap) {
                            dimensions = (LinkedHashMap) obj;
                        }
                        for (String k : dimensions.keySet()) {
                            if (field1.getName().equals(k)) {
                                field1.set(productDimension, dimensions.get(k));
                            }
                        }
                    }
                    break;
                case BACKORDERS:
                    if (obj.toString().equals("no"))
                        prop = false;
                    else
                        prop = true;
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return prop;
    }
}
