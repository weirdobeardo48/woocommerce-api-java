package woocommerce.handler;

import woocommerce.entity.StoreInformation;
import woocommerce.handler.impl.OrderHandler;
import woocommerce.handler.impl.ProductVariableHandler;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class WoocommerceHandler extends APIHandler {
    private final ProductVariableHandler product;
    private final OrderHandler order;

    public ProductVariableHandler product() {
        return product;
    }

    // Other handler go here
    public static class Builder {
        private String URL;
        private String API_KEY;
        private String API_SECRET;
        private int API_VERSION = 3;
        private boolean ignoreSSLError = false;
        private Map<String, String> headers;
        private StoreInformation storeInformation;


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

        public Builder setAPI_VERSION(int API_VERSION) {
            this.API_VERSION = API_VERSION;
            return this;
        }

        public Builder setIgnoreSSLError(boolean ignoreSSLError) {
            this.ignoreSSLError = ignoreSSLError;
            return this;
        }

        public WoocommerceHandler build() {
            // Init handler here
            return new WoocommerceHandler(this);
        }
    }

    public void addHeaders(String key, String value) {
        if (this.headers != null) {
            this.headers = new HashMap<>();
        }
        this.headers.put(key, value);

    }

    public void addHeaders(Map<String, String> headers) {
        if (this.headers != null) {
            this.headers = new HashMap<>();
        }
        this.headers.putAll(headers);
    }

    private WoocommerceHandler(Builder builder) {
        this.storeInformation = new StoreInformation();
        this.storeInformation.setAPI_KEY(builder.API_KEY);
        this.storeInformation.setAPI_SECRET(builder.API_SECRET);
        this.storeInformation.setURL(builder.URL);

        this.ignoreSSLError = builder.ignoreSSLError;

        this.API_VERSION = builder.API_VERSION;

        if (this.headers == null) {
            this.headers = new HashMap<>();
        }
        String Authorization = Base64.getEncoder().encodeToString((String.format("%s:%s", storeInformation.getAPI_KEY(), storeInformation.getAPI_SECRET())).getBytes());
        this.headers = new HashMap<>();
        this.headers.put("Authorization", String.format("Basic %s", Authorization));
        this.headers.putAll(builder.headers);

        //Init handler
        this.product = new ProductVariableHandler();
        this.order = new OrderHandler();
    }


}
