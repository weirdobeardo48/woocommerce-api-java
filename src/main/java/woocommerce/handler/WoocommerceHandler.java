package woocommerce.handler;

import woocommerce.handler.impl.ProductVariableHandler;

public class WoocommerceHandler {
    private final ProductVariableHandler product;

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
        private ProductVariableHandler productVariableHandler;

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
            productVariableHandler = new ProductVariableHandler.Builder().setAPI_SECRET(API_SECRET).setAPI_KEY(API_KEY).setURL(URL).setAPI_VERSION(API_VERSION).setIgnoreSSLError(ignoreSSLError).build();
            return new WoocommerceHandler(this);
        }
    }

    private WoocommerceHandler(Builder builder) {
        this.product = builder.productVariableHandler;
    }


}
