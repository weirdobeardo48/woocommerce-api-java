package woocommerce.entity.order;

import java.util.List;

public class OrderFeeLine {
    private int id;
    private String name;
    private String taxClass;
    private String taxStatus;
    private String total;
    private List<OrderTax> taxes;
    private List<OrderMetadata> metadata;
}
