package woocommerce.entity.order;

import java.util.List;

public class OrderLineItem {
    private int id;
    private String name;
    private int productId;
    private int variationId;
    private int quantity;
    private String taxClass;
    private String subTotal;
    private String subTotalTax;
    private String total;
    private String totalTax;
    private List<OrderTax> taxes;
    private List<OrderMetadata> metadata;
    private String sku;
    private String price;
}
