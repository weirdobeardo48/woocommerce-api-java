package woocommerce.entity.order;

import java.util.List;

public class OrderTaxLine {
    private int id;
    private String rateCode;
    private String rateId;
    private String label;
    private String compound;
    private String taxTotal;
    private String shippingTaxTotal;
    private List<OrderMetadata> metadata;
}
