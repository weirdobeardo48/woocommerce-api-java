package woocommerce.handler.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import woocommerce.entity.StoreInformation;
import woocommerce.entity.product.ProductVariable;
import woocommerce.exception.product.CannotCreateProductException;
import woocommerce.handler.IWoocommerce;
import woocommerce.handler.utils.ProductRequest;
import woocommerce.handler.utils.WoocommerceAPIVersion;
import woocommerce.utils.ReflectionUtils;

import java.util.List;

/**
 * @author TruongNX25
 */

public class ProductVariableHandler implements IWoocommerce<ProductVariable> {
    private static final Logger LOG = Logger.getLogger(ProductVariableHandler.class);

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
        if (productVariable != null) {
            ObjectMapper mapper = new ObjectMapper();
            try {
                String data = mapper.writeValueAsString(productVariable);
                String json = productRequest.POST(data);
                return ReflectionUtils.jsonStringToProductVariable(json);
            } catch (JsonProcessingException e) {
                try {
                    throw new CannotCreateProductException(String.format("Cannot create product with:\nData: %s\nStore Information: %s", productVariable.toString(), storeInformation.toString()), e.getCause());
                } catch (CannotCreateProductException ignore) {
                }
            }
        }
        return null;
    }

    public List<ProductVariable> getAll() {
        return null;
    }

    public ProductVariable get(int id) {
        String json = productRequest.GET(id);
        if (json != null) {
            return ReflectionUtils.jsonStringToProductVariable(json);
        }
        return null;
    }


    public boolean update(int id) {
        return false;
    }

    public boolean delete(int id) {
        String json = productRequest.DELETE(id);
        return json != null;
    }

    public List<ProductVariable> batchUpdate(List<ProductVariable> productVariables) {
        return null;
    }


}
