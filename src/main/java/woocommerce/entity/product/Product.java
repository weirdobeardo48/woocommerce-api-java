package woocommerce.entity.product;


import woocommerce.annotation.JsonElement;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author TruongNX25
 */

public abstract class Product {

    @JsonElement(key = "id")
    private Integer id;
    @JsonElement(key = "slug")
    private String slug;
    @JsonElement(key = "permalink")
    private String permalink;
    @JsonElement(key = "date_created")
    private LocalDateTime dateCreated;
    @JsonElement(key = "date_created_gmt")
    private LocalDateTime dateCreatedGMT;
    @JsonElement(key = "data_modified")
    private LocalDateTime dateModified;
    @JsonElement(key = "data_modified_gmt")
    private LocalDateTime dateModifiedGMT;
    @JsonElement(key = "type")
    private String type;
    @JsonElement(key = "status")
    private String status;
    @JsonElement(key = "description")
    private String description;
    @JsonElement(key = "short_description")
    private String shortDescription;
    @JsonElement(key = "sku")
    private String sku;
    // According to doc, price would be a String??
    @JsonElement(key = "price")
    private String price;
    @JsonElement(key = "regular_price")
    private String regularPrice;
    @JsonElement(key = "sale_price")
    private String salePrice;
    @JsonElement(key = "date_on_sale_from")
    private LocalDateTime dateOnSaleFrom;
    @JsonElement(key = "date_on_sale_from_gmt")
    private LocalDateTime dateOnSaleFromGMT;
    @JsonElement(key = "date_on_sale_to")
    private LocalDateTime dateOnSaleTo;
    @JsonElement(key = "date_on_sale_to_gmt")
    private LocalDateTime dateOnSaleToGMT;
    @JsonElement(key = "price_html")
    private String priceHTML;
    @JsonElement(key = "on_sale")
    private boolean onSale;
    @JsonElement(key = "purchasable")
    private boolean purchasable;
    @JsonElement(key = "total_sales")
    private Integer totalSales;
    @JsonElement(key = "virtual")
    private boolean virtual;
    @JsonElement(key = "downloadable")
    private boolean downloadable;
    @JsonElement(key = "downloads")
    private List<ProductDownload> downloads;
    @JsonElement(key = "download_limit")
    private Integer downloadLimit;
    @JsonElement(key = "download_expiry")
    private Integer downloadExpiry;
    @JsonElement(key = "tax_status")
    private String taxStatus;
    @JsonElement(key = "tax_class")
    private String taxClass;
    @JsonElement(key = "manage_stock")
    private boolean manageStock;
    @JsonElement(key = "stock_quantity")
    private Integer stockQuantity;
    @JsonElement(key = "stock_status")
    private String stockStatus;
    @JsonElement(key = "back_orders")
    private String backOrders;
    @JsonElement(key = "backorders_allowed")
    private boolean backOrdersAllowed;
    @JsonElement(key = "sold_individually")
    private boolean soldIndividually;
    @JsonElement(key = "weight")
    private String weight;
    @JsonElement(key = "dimensions")
    private ProductDimension dimensions;
    @JsonElement(key = "shipping_required")
    private boolean shippingRequired;
    @JsonElement(key = "shipping_taxable")
    private boolean shippingTaxable;
    @JsonElement(key = "shipping_class")
    private String shippingClass;
    @JsonElement(key = "shipping_class_id")
    private Integer shippingClassId;
    @JsonElement(key = "reviews_allowed")
    private boolean reviewsAllowed;
    @JsonElement(key = "rating_count")
    private Integer ratingCount;
    @JsonElement(key = "related_ids")
    private List<Integer> relatedIds;
    @JsonElement(key = "upsell_ids")
    private List<Integer> upsellIds;
    @JsonElement(key = "parent_id")
    private Integer parentId;
    @JsonElement(key = "purchase_note")
    private String purchaseNote;
    @JsonElement(key = "tags")
    private List<ProductTag> tags;
    @JsonElement(key = "images")
    private List<ProductImage> images;
    @JsonElement(key = "attributes")
    private List<ProductAttribute> attributes;
    @JsonElement(key = "variations")
    private List<Integer> variations;
    @JsonElement(key = "menu_order")
    private Integer menuOrder;
    @JsonElement(key = "meta_data")
    private List<ProductMetadata> metadata;

    public Integer getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getPermalink() {
        return permalink;
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

    public String getType() {
        return type;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getSku() {
        return sku;
    }

    public String getPrice() {
        return price;
    }

    public String getRegularPrice() {
        return regularPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public LocalDateTime getLocalDateTimeOnSaleFrom() {
        return dateOnSaleFrom;
    }

    public LocalDateTime getLocalDateTimeOnSaleFromGMT() {
        return dateOnSaleFromGMT;
    }

    public LocalDateTime getLocalDateTimeOnSaleTo() {
        return dateOnSaleTo;
    }

    public LocalDateTime getLocalDateTimeOnSaleToGMT() {
        return dateOnSaleToGMT;
    }

    public String getPriceHTML() {
        return priceHTML;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public Integer getTotalSales() {
        return totalSales;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public boolean isDownloadable() {
        return downloadable;
    }

    public List<ProductDownload> getDownloads() {
        return downloads;
    }

    public Integer getDownloadLimit() {
        return downloadLimit;
    }

    public Integer getDownloadExpiry() {
        return downloadExpiry;
    }

    public String getTaxStatus() {
        return taxStatus;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public boolean isManageStock() {
        return manageStock;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public String getStockStatus() {
        return stockStatus;
    }

    public String getBackOrders() {
        return backOrders;
    }

    public boolean isBackOrdersAllowed() {
        return backOrdersAllowed;
    }

    public boolean isSoldIndividually() {
        return soldIndividually;
    }

    public String getWeight() {
        return weight;
    }

    public ProductDimension getDimensions() {
        return dimensions;
    }

    public boolean isShippingRequired() {
        return shippingRequired;
    }

    public boolean isShippingTaxable() {
        return shippingTaxable;
    }

    public String getShippingClass() {
        return shippingClass;
    }

    public Integer getShippingClassId() {
        return shippingClassId;
    }

    public boolean isReviewsAllowed() {
        return reviewsAllowed;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public List<Integer> getRelatedIds() {
        return relatedIds;
    }

    public List<Integer> getUpsellIds() {
        return upsellIds;
    }

    public Integer getParentId() {
        return parentId;
    }

    public String getPurchaseNote() {
        return purchaseNote;
    }

    public List<ProductTag> getTags() {
        return tags;
    }

    public List<ProductImage> getImages() {
        return images;
    }

    public List<ProductAttribute> getAttributes() {
        return attributes;
    }

    public List<Integer> getVariations() {
        return variations;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public List<ProductMetadata> getMetadata() {
        return metadata;
    }

    abstract static class Builder<T extends Builder<T>> {

        private Integer id;
        private String slug;
        private String permalink;
        private LocalDateTime dateCreated;
        private LocalDateTime dateCreatedGMT;
        private LocalDateTime dateModified;
        private LocalDateTime dateModifiedGMT;
        private String type;
        private String status;
        private String description;
        private String shortDescription;
        private String sku;
        // According to doc, price would be a String??
        private String price;
        private String regularPrice;
        private String salePrice;
        private LocalDateTime dateOnSaleFrom;
        private LocalDateTime dateOnSaleFromGMT;
        private LocalDateTime dateOnSaleTo;
        private LocalDateTime dateOnSaleToGMT;
        private String priceHTML;
        private boolean onSale;
        private boolean purchasable;
        private Integer totalSales;
        private boolean virtual;
        private boolean downloadable;
        private List<ProductDownload> downloads;
        private Integer downloadLimit;
        private Integer downloadExpiry;
        private String taxStatus;
        private String taxClass;
        private boolean manageStock;
        private Integer stockQuantity;
        private String stockStatus;
        private String backOrders;
        private boolean backOrdersAllowed;
        private boolean soldIndividually;
        private String weight;
        private ProductDimension dimensions;
        private boolean shippingRequired;
        private boolean shippingTaxable;
        private String shippingClass;
        private Integer shippingClassId;
        private boolean reviewsAllowed;
        private Integer ratingCount;
        private List<Integer> relatedIds;
        private List<Integer> upsellIds;
        private Integer parentId;
        private String purchaseNote;
        private List<ProductTag> tags;
        private List<ProductImage> images;
        private List<ProductAttribute> attributes;
        private List<Integer> variations;
        private Integer menuOrder;
        private List<ProductMetadata> metadata;

        public T setId(Integer id) {
            this.id = id;
            return self();
        }

        public T setSlug(String slug) {
            this.slug = slug;
            return self();
        }

        public T setPermalink(String permalink) {
            this.permalink = permalink;
            return self();
        }

        public T setLocalDateTimeCreated(LocalDateTime dateCreated) {
            this.dateCreated = dateCreated;
            return self();
        }

        public T setLocalDateTimeCreatedGMT(LocalDateTime dateCreatedGMT) {
            this.dateCreatedGMT = dateCreatedGMT;
            return self();
        }

        public T setLocalDateTimeModified(LocalDateTime dateModified) {
            this.dateModified = dateModified;
            return self();
        }

        public T setLocalDateTimeModifiedGMT(LocalDateTime dateModifiedGMT) {
            this.dateModifiedGMT = dateModifiedGMT;
            return self();
        }

        public T setType(String type) {
            this.type = type;
            return self();
        }

        public T setStatus(String status) {
            this.status = status;
            return self();
        }

        public T setDescription(String description) {
            this.description = description;
            return self();
        }

        public T setShortDescription(String shortDescription) {
            this.shortDescription = shortDescription;
            return self();
        }

        public T setSku(String sku) {
            this.sku = sku;
            return self();
        }

        public T setPrice(String price) {
            this.price = price;
            return self();
        }

        public T setRegularPrice(String regularPrice) {
            this.regularPrice = regularPrice;
            return self();
        }

        public T setSalePrice(String salePrice) {
            this.salePrice = salePrice;
            return self();
        }

        public T setLocalDateTimeOnSaleFrom(LocalDateTime dateOnSaleFrom) {
            this.dateOnSaleFrom = dateOnSaleFrom;
            return self();
        }

        public T setLocalDateTimeOnSaleFromGMT(LocalDateTime dateOnSaleFromGMT) {
            this.dateOnSaleFromGMT = dateOnSaleFromGMT;
            return self();
        }

        public T setLocalDateTimeOnSaleTo(LocalDateTime dateOnSaleTo) {
            this.dateOnSaleTo = dateOnSaleTo;
            return self();
        }

        public T setLocalDateTimeOnSaleToGMT(LocalDateTime dateOnSaleToGMT) {
            this.dateOnSaleToGMT = dateOnSaleToGMT;
            return self();
        }

        public T setPriceHTML(String priceHTML) {
            this.priceHTML = priceHTML;
            return self();
        }

        public T setOnSale(boolean onSale) {
            this.onSale = onSale;
            return self();
        }

        public T setPurchasable(boolean purchasable) {
            this.purchasable = purchasable;
            return self();
        }

        public T setTotalSales(Integer totalSales) {
            this.totalSales = totalSales;
            return self();
        }

        public T setVirtual(boolean virtual) {
            this.virtual = virtual;
            return self();
        }

        public T setDownloadable(boolean downloadable) {
            this.downloadable = downloadable;
            return self();
        }

        public T setDownloads(List<ProductDownload> downloads) {
            this.downloads = downloads;
            return self();
        }

        public T setDownloadLimit(Integer downloadLimit) {
            this.downloadLimit = downloadLimit;
            return self();
        }

        public T setDownloadExpiry(Integer downloadExpiry) {
            this.downloadExpiry = downloadExpiry;
            return self();
        }

        public T setTaxStatus(String taxStatus) {
            this.taxStatus = taxStatus;
            return self();
        }

        public T setTaxClass(String taxClass) {
            this.taxClass = taxClass;
            return self();
        }

        public T setManageStock(boolean manageStock) {
            this.manageStock = manageStock;
            return self();
        }

        public T setStockQuantity(Integer stockQuantity) {
            this.stockQuantity = stockQuantity;
            return self();
        }

        public T setStockStatus(String stockStatus) {
            this.stockStatus = stockStatus;
            return self();
        }

        public T setBackOrders(String backOrders) {
            this.backOrders = backOrders;
            return self();
        }

        public T setBackOrdersAllowed(boolean backOrdersAllowed) {
            this.backOrdersAllowed = backOrdersAllowed;
            return self();
        }

        public T setSoldIndividually(boolean soldIndividually) {
            this.soldIndividually = soldIndividually;
            return self();
        }

        public T setWeight(String weight) {
            this.weight = weight;
            return self();
        }

        public T setDimensions(ProductDimension dimensions) {
            this.dimensions = dimensions;
            return self();
        }

        public T setShippingRequired(boolean shippingRequired) {
            this.shippingRequired = shippingRequired;
            return self();
        }

        public T setShippingTaxable(boolean shippingTaxable) {
            this.shippingTaxable = shippingTaxable;
            return self();
        }

        public T setShippingClass(String shippingClass) {
            this.shippingClass = shippingClass;
            return self();
        }

        public T setShippingClassId(Integer shippingClassId) {
            this.shippingClassId = shippingClassId;
            return self();
        }

        public T setReviewsAllowed(boolean reviewsAllowed) {
            this.reviewsAllowed = reviewsAllowed;
            return self();
        }

        public T setRatingCount(Integer ratingCount) {
            this.ratingCount = ratingCount;
            return self();
        }

        public T setRelatedIds(List<Integer> relatedIds) {
            this.relatedIds = relatedIds;
            return self();
        }

        public T setUpsellIds(List<Integer> upsellIds) {
            this.upsellIds = upsellIds;
            return self();
        }

        public T setParentId(Integer parentId) {
            this.parentId = parentId;
            return self();
        }

        public T setPurchaseNote(String purchaseNote) {
            this.purchaseNote = purchaseNote;
            return self();
        }

        public T setTags(List<ProductTag> tags) {
            this.tags = tags;
            return self();
        }

        public T setImages(List<ProductImage> images) {
            this.images = images;
            return self();
        }

        public T setAttributes(List<ProductAttribute> attributes) {
            this.attributes = attributes;
            return self();
        }

        public T setVariations(List<Integer> variations) {
            this.variations = variations;
            return self();
        }

        public T setMenuOrder(Integer menuOrder) {
            this.menuOrder = menuOrder;
            return self();
        }

        public T setMetadata(List<ProductMetadata> metadata) {
            this.metadata = metadata;
            return self();
        }

        protected abstract T self();

        abstract Product build();
    }

    Product() {

    }

    Product(Builder<?> builder) {
        id = builder.id;
        slug = builder.slug;
        permalink = builder.permalink;
        dateCreated = builder.dateCreated;
        dateCreatedGMT = builder.dateCreatedGMT;
        dateModified = builder.dateModified;
        dateModifiedGMT = builder.dateModifiedGMT;
        type = builder.type;
        status = builder.status;
        description = builder.description;
        shortDescription = builder.shortDescription;
        sku = builder.sku;
        // According to doc, price would be a String??
        price = builder.price;
        regularPrice = builder.regularPrice;
        salePrice = builder.salePrice;
        dateOnSaleFrom = builder.dateOnSaleFrom;
        dateOnSaleFromGMT = builder.dateOnSaleFromGMT;
        dateOnSaleTo = builder.dateOnSaleTo;
        dateOnSaleToGMT = builder.dateOnSaleToGMT;
        priceHTML = builder.priceHTML;
        onSale = builder.onSale;
        purchasable = builder.purchasable;
        totalSales = builder.totalSales;
        virtual = builder.virtual;
        downloadable = builder.downloadable;
        downloads = builder.downloads;
        downloadLimit = builder.downloadLimit;
        downloadExpiry = builder.downloadExpiry;
        taxStatus = builder.taxStatus;
        taxClass = builder.taxClass;
        manageStock = builder.manageStock;
        stockQuantity = builder.stockQuantity;
        stockStatus = builder.stockStatus;
        backOrders = builder.backOrders;
        backOrdersAllowed = builder.backOrdersAllowed;
        soldIndividually = builder.soldIndividually;
        weight = builder.weight;
        dimensions = builder.dimensions;
        shippingRequired = builder.shippingRequired;
        shippingTaxable = builder.shippingTaxable;
        shippingClass = builder.shippingClass;
        shippingClassId = builder.shippingClassId;
        reviewsAllowed = builder.reviewsAllowed;
        ratingCount = builder.ratingCount;
        relatedIds = builder.relatedIds;
        upsellIds = builder.upsellIds;
        parentId = builder.parentId;
        purchaseNote = builder.purchaseNote;
        tags = builder.tags;
        images = builder.images;
        attributes = builder.attributes;
        variations = builder.variations;
        menuOrder = builder.menuOrder;
        metadata = builder.metadata;
    }
}

