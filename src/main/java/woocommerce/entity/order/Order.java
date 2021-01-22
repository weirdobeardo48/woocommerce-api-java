package woocommerce.entity.order;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author TruongNX25
 */

public class Order {
    /**
     * Reference: https://woocommerce.github.io/woocommerce-rest-api-docs/#order-properties
     */
    private final int id;
    private final int parentId;
    private final String number;
    private final String orderKey;
    private final String createdVia;
    private final String version;
    private final String status;
    private final String currency;
    private final LocalDateTime dateCreated;
    private final LocalDateTime dateCreatedGMT;
    private final LocalDateTime dateModified;
    private final LocalDateTime dateModifiedGMT;
    private final String discountTotal;
    private final String discountTax;
    private final String shippingTotal;
    private final String shippingTax;
    private final String cartTax;
    private final String total;
    private final String totalTax;
    private final boolean pricesIncludeTax;
    private final int customerId;
    private final String customerIpAddress;
    private final String customerUserAgent;
    private final String customerNote;
    private final OrderBilling billing;
    private final OrderShipping shipping;
    private final String paymentMethod;
    private final String paymentMethodTitle;
    private final String transactionId;
    private final LocalDateTime datePaid;
    private final LocalDateTime datePaidGMT;
    private final LocalDateTime dateCompleted;
    private final LocalDateTime dateCompletedGMT;
    private final String cartHash;
    private final List<OrderMetadata> metadata;
    private final List<OrderLineItem> lineItems;
    private final List<OrderTaxLine> taxLines;
    private final List<OrderShippingLine> shippingLines;
    private final List<OrderFeeLine> feeLines;
    private final List<OrderCouponLine> couponLines;
    private final List<OrderRefund> refunds;
    private final boolean setPaid;

    public int getId() {
        return id;
    }

    public int getParentId() {
        return parentId;
    }

    public String getNumber() {
        return number;
    }

    public String getOrderKey() {
        return orderKey;
    }

    public String getCreatedVia() {
        return createdVia;
    }

    public String getVersion() {
        return version;
    }

    public String getStatus() {
        return status;
    }

    public String getCurrency() {
        return currency;
    }

    public LocalDateTime getLocalDateTimeCreated() {
        return dateCreated;
    }

    public LocalDateTime getLocalDateTimeCreatedGMT() {
        return dateCreatedGMT;
    }

    public LocalDateTime getLocalDateTimeModified() {
        return dateModified;
    }

    public LocalDateTime getLocalDateTimeModifiedGMT() {
        return dateModifiedGMT;
    }

    public String getDiscountTotal() {
        return discountTotal;
    }

    public String getDiscountTax() {
        return discountTax;
    }

    public String getShippingTotal() {
        return shippingTotal;
    }

    public String getShippingTax() {
        return shippingTax;
    }

    public String getCartTax() {
        return cartTax;
    }

    public String getTotal() {
        return total;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public boolean isPricesIncludeTax() {
        return pricesIncludeTax;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerIpAddress() {
        return customerIpAddress;
    }

    public String getCustomerUserAgent() {
        return customerUserAgent;
    }

    public String getCustomerNote() {
        return customerNote;
    }

    public OrderBilling getBilling() {
        return billing;
    }

    public OrderShipping getShipping() {
        return shipping;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getPaymentMethodTitle() {
        return paymentMethodTitle;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public LocalDateTime getLocalDateTimePaid() {
        return datePaid;
    }

    public LocalDateTime getLocalDateTimePaidGMT() {
        return datePaidGMT;
    }

    public LocalDateTime getLocalDateTimeCompleted() {
        return dateCompleted;
    }

    public LocalDateTime getLocalDateTimeCompletedGMT() {
        return dateCompletedGMT;
    }

    public String getCartHash() {
        return cartHash;
    }

    public List<OrderMetadata> getMetadata() {
        return metadata;
    }

    public List<OrderLineItem> getLineItems() {
        return lineItems;
    }

    public List<OrderTaxLine> getTaxLines() {
        return taxLines;
    }

    public List<OrderShippingLine> getShippingLines() {
        return shippingLines;
    }

    public List<OrderFeeLine> getFeeLines() {
        return feeLines;
    }

    public List<OrderCouponLine> getCouponLines() {
        return couponLines;
    }

    public List<OrderRefund> getRefunds() {
        return refunds;
    }

    public boolean isSetPaid() {
        return setPaid;
    }

    public static class Builder {
        private int id;
        private int parentId;
        private String number;
        private String orderKey;
        private String createdVia;
        private String version;
        private String status;
        private String currency;
        private LocalDateTime dateCreated;
        private LocalDateTime dateCreatedGMT;
        private LocalDateTime dateModified;
        private LocalDateTime dateModifiedGMT;
        private String discountTotal;
        private String discountTax;
        private String shippingTotal;
        private String shippingTax;
        private String cartTax;
        private String total;
        private String totalTax;
        private boolean pricesIncludeTax;
        private int customerId;
        private String customerIpAddress;
        private String customerUserAgent;
        private String customerNote;
        private OrderBilling billing;
        private OrderShipping shipping;
        private String paymentMethod;
        private String paymentMethodTitle;
        private String transactionId;
        private LocalDateTime datePaid;
        private LocalDateTime datePaidGMT;
        private LocalDateTime dateCompleted;
        private LocalDateTime dateCompletedGMT;
        private String cartHash;
        private List<OrderMetadata> metadata;
        private List<OrderLineItem> lineItems;
        private List<OrderTaxLine> taxLines;
        private List<OrderShippingLine> shippingLines;
        private List<OrderFeeLine> feeLines;
        private List<OrderCouponLine> couponLines;
        private List<OrderRefund> refunds;
        private boolean setPaid;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setParentId(int parentId) {
            this.parentId = parentId;
            return this;
        }

        public Builder setNumber(String number) {
            this.number = number;
            return this;
        }

        public Builder setOrderKey(String orderKey) {
            this.orderKey = orderKey;
            return this;
        }

        public Builder setCreatedVia(String createdVia) {
            this.createdVia = createdVia;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder setLocalDateTimeCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return this;
        }

        public Builder setLocalDateTimeCreatedGMT(LocalDateTime dateCreatedGMT) {
            this.dateCreatedGMT = dateCreatedGMT;
            return this;
        }

        public Builder setLocalDateTimeModified(LocalDateTime dateModified) {
            this.dateModified = dateModified;
            return this;
        }

        public Builder setLocalDateTimeModifiedGMT(LocalDateTime dateModifiedGMT) {
            this.dateModifiedGMT = dateModifiedGMT;
            return this;
        }

        public Builder setDiscountTotal(String discountTotal) {
            this.discountTotal = discountTotal;
            return this;
        }

        public Builder setDiscountTax(String discountTax) {
            this.discountTax = discountTax;
            return this;
        }

        public Builder setShippingTotal(String shippingTotal) {
            this.shippingTotal = shippingTotal;
            return this;
        }

        public Builder setShippingTax(String shippingTax) {
            this.shippingTax = shippingTax;
            return this;
        }

        public Builder setCartTax(String cartTax) {
            this.cartTax = cartTax;
            return this;
        }

        public Builder setTotal(String total) {
            this.total = total;
            return this;
        }

        public Builder setTotalTax(String totalTax) {
            this.totalTax = totalTax;
            return this;
        }

        public Builder setPricesIncludeTax(boolean pricesIncludeTax) {
            this.pricesIncludeTax = pricesIncludeTax;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setCustomerIpAddress(String customerIpAddress) {
            this.customerIpAddress = customerIpAddress;
            return this;
        }

        public Builder setCustomerUserAgent(String customerUserAgent) {
            this.customerUserAgent = customerUserAgent;
            return this;
        }

        public Builder setCustomerNote(String customerNote) {
            this.customerNote = customerNote;
            return this;
        }

        public Builder setBilling(OrderBilling billing) {
            this.billing = billing;
            return this;
        }

        public Builder setShipping(OrderShipping shipping) {
            this.shipping = shipping;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Builder setPaymentMethodTitle(String paymentMethodTitle) {
            this.paymentMethodTitle = paymentMethodTitle;
            return this;
        }

        public Builder setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public Builder setLocalDateTimePaid(LocalDateTime datePaid) {
            this.datePaid = datePaid;
            return this;
        }

        public Builder setLocalDateTimePaidGMT(LocalDateTime datePaidGMT) {
            this.datePaidGMT = datePaidGMT;
            return this;
        }

        public Builder setLocalDateTimeCompleted(LocalDateTime dateCompleted) {
            this.dateCompleted = dateCompleted;
            return this;
        }

        public Builder setLocalDateTimeCompletedGMT(LocalDateTime dateCompletedGMT) {
            this.dateCompletedGMT = dateCompletedGMT;
            return this;
        }

        public Builder setCartHash(String cartHash) {
            this.cartHash = cartHash;
            return this;
        }

        public Builder setMetadata(List<OrderMetadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setLineItems(List<OrderLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Builder setTaxLines(List<OrderTaxLine> taxLines) {
            this.taxLines = taxLines;
            return this;
        }

        public Builder setShippingLines(List<OrderShippingLine> shippingLines) {
            this.shippingLines = shippingLines;
            return this;
        }

        public Builder setFeeLines(List<OrderFeeLine> feeLines) {
            this.feeLines = feeLines;
            return this;
        }

        public Builder setCouponLines(List<OrderCouponLine> couponLines) {
            this.couponLines = couponLines;
            return this;
        }

        public Builder setRefunds(List<OrderRefund> refunds) {
            this.refunds = refunds;
            return this;
        }

        public Builder setSetPaid(boolean setPaid) {
            this.setPaid = setPaid;
            return this;
        }

        public Order build() {
            return new Order(this);
        }

    }

    Order(Builder builder) {
        id = builder.id;
        parentId = builder.parentId;
        number = builder.number;
        orderKey = builder.orderKey;
        createdVia = builder.createdVia;
        version = builder.version;
        status = builder.status;
        currency = builder.currency;
        dateCreated = builder.dateCreated;
        dateCreatedGMT = builder.dateCreatedGMT;
        dateModified = builder.dateModified;
        dateModifiedGMT = builder.dateModifiedGMT;
        discountTotal = builder.discountTotal;
        discountTax = builder.discountTax;
        shippingTotal = builder.shippingTotal;
        shippingTax = builder.shippingTax;
        cartTax = builder.cartTax;
        total = builder.total;
        totalTax = builder.totalTax;
        pricesIncludeTax = builder.pricesIncludeTax;
        customerId = builder.customerId;
        customerIpAddress = builder.customerIpAddress;
        customerUserAgent = builder.customerUserAgent;
        customerNote = builder.customerNote;
        billing = builder.billing;
        shipping = builder.shipping;
        paymentMethod = builder.paymentMethod;
        paymentMethodTitle = builder.paymentMethodTitle;
        transactionId = builder.transactionId;
        datePaid = builder.datePaid;
        datePaidGMT = builder.datePaidGMT;
        dateCompleted = builder.dateCompleted;
        dateCompletedGMT = builder.dateCompletedGMT;
        cartHash = builder.cartHash;
        metadata = builder.metadata;
        lineItems = builder.lineItems;
        taxLines = builder.taxLines;
        shippingLines = builder.shippingLines;
        feeLines = builder.feeLines;
        couponLines = builder.couponLines;
        refunds = builder.refunds;
        setPaid = builder.setPaid;
    }
}
