package woocommerce.entity.product;


import woocommerce.entity.order.Order;

import java.util.Date;

public class TestBuilder {
    public static void main(String[] args) {
        ProductVariable productVariable = new ProductVariable.Builder().setExternalURL("asdfad").build();
        productVariable.getId();
        boolean a = productVariable.isFeatured();
        System.out.println(a);
        Order order = new Order.Builder().setOrderKey("asdfa").build();
    }
}
