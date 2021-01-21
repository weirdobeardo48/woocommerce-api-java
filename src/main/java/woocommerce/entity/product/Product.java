package woocommerce.entity.product;

import gnu.trove.list.array.TIntArrayList;

import java.util.Date;
import java.util.List;

/**
 * @author TruongNX25
 */

public abstract class Product {

    private final int id;
    private final String slug;
    private final String permalink;
    private final Date dateCreated;
    private final Date dateCreatedGMT;
    private final Date dateModified;
    private final Date dateModifiedGMT;
    private final String type;
    private final String status;
    private final String description;
    private final String shortDescription;
    private final String sku;
    // According to doc, price would be a String??
    private final String price;
    private final String regularPrice;
    private final String salePrice;
    private final Date dateOnSaleFrom;
    private final Date dateOnSaleFromGMT;
    private final Date dateOnSaleTo;
    private final Date dateOnSaleToGMT;
    private final String priceHTML;
    private final boolean onSale;
    private final boolean purchasable;
    private final int totalSales;
    private final boolean virtual;
    private final boolean downloadable;
    private final List<ProductDownload> downloads;
    private final int downloadLimit;
    private final int downloadExpiry;
    private final String taxStatus;
    private final String taxClass;
    private final boolean manageStock;
    private final int stockQuantity;
    private final String stockStatus;
    private final String backOrders;
    private final boolean backOrdersAllowed;
    private final boolean soldIndividually;
    private final String weight;
    private final ProductDimension dimensions;
    private final boolean shippingRequired;
    private final boolean shippingTaxable;
    private final String shippingClass;
    private final int shippingClassId;
    private final boolean reviewsAllowed;
    private final int ratingCount;
    private final TIntArrayList relatedIds;
    private final TIntArrayList upsellIds;
    private final int parentId;
    private final String purchaseNote;
    private final List<ProductTag> tags;
    private final List<ProductImage> images;
    private final List<ProductAttribute> attributes;
    private final TIntArrayList variations;
    private final int menuOrder;
    private final List<ProductMetadata> metadata;

    public int getId() {
        return id;
    }

    public String getSlug() {
        return slug;
    }

    public String getPermalink() {
        return permalink;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateCreatedGMT() {
        return dateCreatedGMT;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public Date getDateModifiedGMT() {
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

    public Date getDateOnSaleFrom() {
        return dateOnSaleFrom;
    }

    public Date getDateOnSaleFromGMT() {
        return dateOnSaleFromGMT;
    }

    public Date getDateOnSaleTo() {
        return dateOnSaleTo;
    }

    public Date getDateOnSaleToGMT() {
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

    public int getTotalSales() {
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

    public int getDownloadLimit() {
        return downloadLimit;
    }

    public int getDownloadExpiry() {
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

    public int getStockQuantity() {
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

    public int getShippingClassId() {
        return shippingClassId;
    }

    public boolean isReviewsAllowed() {
        return reviewsAllowed;
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public TIntArrayList getRelatedIds() {
        return relatedIds;
    }

    public TIntArrayList getUpsellIds() {
        return upsellIds;
    }

    public int getParentId() {
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

    public TIntArrayList getVariations() {
        return variations;
    }

    public int getMenuOrder() {
        return menuOrder;
    }

    public List<ProductMetadata> getMetadata() {
        return metadata;
    }

    abstract static class Builder<T extends Builder<T>> {

        private int id;
        private String slug;
        private String permalink;
        private Date dateCreated;
        private Date dateCreatedGMT;
        private Date dateModified;
        private Date dateModifiedGMT;
        private String type;
        private String status;
        private String description;
        private String shortDescription;
        private String sku;
        // According to doc, price would be a String??
        private String price;
        private String regularPrice;
        private String salePrice;
        private Date dateOnSaleFrom;
        private Date dateOnSaleFromGMT;
        private Date dateOnSaleTo;
        private Date dateOnSaleToGMT;
        private String priceHTML;
        private boolean onSale;
        private boolean purchasable;
        private int totalSales;
        private boolean virtual;
        private boolean downloadable;
        private List<ProductDownload> downloads;
        private int downloadLimit;
        private int downloadExpiry;
        private String taxStatus;
        private String taxClass;
        private boolean manageStock;
        private int stockQuantity;
        private String stockStatus;
        private String backOrders;
        private boolean backOrdersAllowed;
        private boolean soldIndividually;
        private String weight;
        private ProductDimension dimensions;
        private boolean shippingRequired;
        private boolean shippingTaxable;
        private String shippingClass;
        private int shippingClassId;
        private boolean reviewsAllowed;
        private int ratingCount;
        private TIntArrayList relatedIds;
        private TIntArrayList upsellIds;
        private int parentId;
        private String purchaseNote;
        private List<ProductTag> tags;
        private List<ProductImage> images;
        private List<ProductAttribute> attributes;
        private TIntArrayList variations;
        private int menuOrder;
        private List<ProductMetadata> metadata;

        public T setId(int id) {
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

        public T setDateCreated(Date dateCreated) {
            this.dateCreated = dateCreated;
            return self();
        }

        public T setDateCreatedGMT(Date dateCreatedGMT) {
            this.dateCreatedGMT = dateCreatedGMT;
            return self();
        }

        public T setDateModified(Date dateModified) {
            this.dateModified = dateModified;
            return self();
        }

        public T setDateModifiedGMT(Date dateModifiedGMT) {
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

        public T setDateOnSaleFrom(Date dateOnSaleFrom) {
            this.dateOnSaleFrom = dateOnSaleFrom;
            return self();
        }

        public T setDateOnSaleFromGMT(Date dateOnSaleFromGMT) {
            this.dateOnSaleFromGMT = dateOnSaleFromGMT;
            return self();
        }

        public T setDateOnSaleTo(Date dateOnSaleTo) {
            this.dateOnSaleTo = dateOnSaleTo;
            return self();
        }

        public T setDateOnSaleToGMT(Date dateOnSaleToGMT) {
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

        public T setTotalSales(int totalSales) {
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

        public T setDownloadLimit(int downloadLimit) {
            this.downloadLimit = downloadLimit;
            return self();
        }

        public T setDownloadExpiry(int downloadExpiry) {
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

        public T setStockQuantity(int stockQuantity) {
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

        public T setShippingClassId(int shippingClassId) {
            this.shippingClassId = shippingClassId;
            return self();
        }

        public T setReviewsAllowed(boolean reviewsAllowed) {
            this.reviewsAllowed = reviewsAllowed;
            return self();
        }

        public T setRatingCount(int ratingCount) {
            this.ratingCount = ratingCount;
            return self();
        }

        public T setRelatedIds(TIntArrayList relatedIds) {
            this.relatedIds = relatedIds;
            return self();
        }

        public T setUpsellIds(TIntArrayList upsellIds) {
            this.upsellIds = upsellIds;
            return self();
        }

        public T setParentId(int parentId) {
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

        public T setVariations(TIntArrayList variations) {
            this.variations = variations;
            return self();
        }

        public T setMenuOrder(int menuOrder) {
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

