package woocommerce.handler;


import woocommerce.entity.product.ProductVariable;
import woocommerce.handler.impl.ProductVariableHandler;

public class TestHandler {
    private static void testProductVariableHandler() {
        ProductVariableHandler productVariableHandler = new ProductVariableHandler.Builder().setURL("https://www.amyna.online").setAPI_KEY("ck_9e82b1fad6f5b72d46f26720fafbcf1fda6f2afb").setAPI_SECRET("cs_5eb52396bebdf7e21998a8205cb20329fa86d0f1").setIgnoreSSLError(true).build();
        productVariableHandler.get(3054718);
    }

    public static void testWoocommerceHandler() {
        WoocommerceHandler woocommerceHandler = new WoocommerceHandler.Builder().setURL("https://www.amyna.online").setAPI_KEY("ck_9e82b1fad6f5b72d46f26720fafbcf1fda6f2afb").setAPI_SECRET("cs_5eb52396bebdf7e21998a8205cb20329fa86d0f1").setIgnoreSSLError(true).build();
        System.out.println(woocommerceHandler.product().get(2092));
//        System.out.println(woocommerceHandler.product().get(3054718));

    }

    public static void main(String[] args) {
        testWoocommerceHandler();
    }

}
