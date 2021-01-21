package woocommerce.entity.order;

import java.util.List;

public class OrderShippingLine {
    private int id;
    private String methodTitle;
    private String methodId;
    private String total;
    private String totalTax;
    private List<OrderTax> taxes;
    private List<OrderMetadata> metadata;
}
