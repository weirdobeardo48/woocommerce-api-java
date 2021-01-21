package woocommerce.entity.order;

import java.util.List;

public class OrderCouponLine {
    private int id;
    private String code;
    private String discount;
    private String discountTax;
    private List<OrderMetadata> metadata;

}
