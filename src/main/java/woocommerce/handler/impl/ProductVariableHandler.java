package woocommerce.handler.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import woocommerce.annotation.JsonElement;
import woocommerce.entity.StoreInformation;
import woocommerce.entity.product.ProductDimension;
import woocommerce.entity.product.ProductVariable;
import woocommerce.handler.IWoocommerce;
import woocommerce.handler.utils.ProductRequest;
import woocommerce.handler.utils.WoocommerceAPIVersion;
import woocommerce.utils.DateTimeUtils;
import woocommerce.utils.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author TruongNX25
 */

public class ProductVariableHandler implements IWoocommerce<ProductVariable> {
    private static final Logger LOG = Logger.getLogger(ProductVariableHandler.class);
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private final int API_VERSION;
    private final ProductRequest productRequest;
    private final StoreInformation storeInformation;

    private ProductVariableHandler(Builder builder) {
        storeInformation = new StoreInformation();
        storeInformation.setURL(builder.URL);
        storeInformation.setAPI_KEY(builder.API_KEY);
        storeInformation.setAPI_SECRET(builder.API_SECRET);
        this.API_VERSION = builder.API_VERSION;
        productRequest = new ProductRequest(storeInformation, WoocommerceAPIVersion.values()[API_VERSION - 1] + "", builder.ignoreSSLError);
    }

    public static class Builder {
        private String URL;
        private String API_KEY;
        private String API_SECRET;
        private boolean ignoreSSLError;
        private int API_VERSION = 3;

        public Builder set(String URL, String API_KEY, String API_SECRET, int API_VERSION, boolean ignoreSSLError) {
            this.setURL(URL);
            this.setAPI_KEY(API_KEY);
            this.setAPI_SECRET(API_SECRET);
            this.setAPI_VERSION((API_VERSION));
            this.setIgnoreSSLError(ignoreSSLError);
            return this;
        }

        public Builder setURL(String URL) {
            this.URL = URL;
            return this;
        }

        public Builder setAPI_KEY(String API_KEY) {
            this.API_KEY = API_KEY;
            return this;
        }

        public Builder setAPI_SECRET(String API_SECRET) {
            this.API_SECRET = API_SECRET;
            return this;
        }

        public Builder setIgnoreSSLError(boolean ignoreSSLError) {
            this.ignoreSSLError = ignoreSSLError;
            return this;
        }

        public Builder setAPI_VERSION(int API_VERSION) {
            this.API_VERSION = API_VERSION;
            return this;
        }

        public ProductVariableHandler build() {
            return new ProductVariableHandler(this);
        }
    }

    public ProductVariable create(ProductVariable productVariable) {
        return null;
    }

    public List<ProductVariable> getAll() {
        return null;
    }

    public ProductVariable get(int id) {
        String json = productRequest.GET(id);
        if (json != null) {
            ProductVariable productVariable = jsonStringToProductVariable(json);
        }
        return null;
    }


    public boolean update(int id) {
        return false;
    }

    public boolean delete(int id) {
        return false;
    }

    public List<ProductVariable> batchUpdate(List<ProductVariable> productVariables) {
        return null;
    }


    private ProductVariable jsonStringToProductVariable(String json) {
        ProductVariable productVariable = null;
        try {
            HashMap<Object, Object> result = MAPPER.readValue(json, HashMap.class);
            productVariable = new ProductVariable.Builder().init();
            List<Field> fields = ReflectionUtils.getAllFields(new ArrayList<>(), ProductVariable.class);
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.isAnnotationPresent(JsonElement.class)) {
                    String key = field.getAnnotation(JsonElement.class).key();
                    try {
                        if (key.contains("date")) {
                            field.set(productVariable, DateTimeUtils.jsonDateStringToJavaDate(result.get(field.getAnnotation(JsonElement.class).key()).toString()));
                        } else if (key.contains("dimensions")) {
                            ProductDimension productDimension = new ProductDimension();
                            for (Field field1 : ProductDimension.class.getDeclaredFields()) {
                                field1.setAccessible(true);
                                LinkedHashMap<String, String> dimensions = ((LinkedHashMap<String, String>) result.get(field.getAnnotation(JsonElement.class).key()));
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
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productVariable;
    }
}
