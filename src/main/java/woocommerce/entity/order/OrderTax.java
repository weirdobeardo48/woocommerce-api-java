package woocommerce.entity.order;

import java.util.List;

public class OrderTax {
    private int id;
    private String rateCode;
    private String rateId;
    private String label;
    private boolean compound;
    private String taxTotal;
    private String shippingTaxTotal;
    private List<OrderMetadata> metadata;

}
