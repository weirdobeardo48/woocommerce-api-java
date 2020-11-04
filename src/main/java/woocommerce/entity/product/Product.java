package woocommerce.entity.product;

import gnu.trove.list.array.TIntArrayList;

import java.util.Date;
import java.util.List;


/**
 * @author TruongNX25
 */

public class Product {
    /**
     * Reference: https://woocommerce.github.io/woocommerce-rest-api-docs/#product-properties
     */
    private final int id;
    private final String name;
    private final String slug;
    private final String permalink;
    private final Date dateCreated;
    private final Date dateCreatedGMT;
    private final Date dateModified;
    private final Date dateModifiedGMT;
    private final String type;
    private final String status;
    private final boolean featured;
    private final String catalogVisibility;
    private final String description;
    private final String shortDescription;
    private final String sku;
    // According to doc, price would be a String??
    private final String price;
    private final String regularPrice;
    private final Date dateOnSaleFrom;
    private final Date dateOnSaleFromGMT;
    private final Date dateOnSaleTo;
    private final Date dateOnSaleToGMT;
    private final String price_html;
    private final boolean onSale;
    private final boolean purchasable;
    private final int totalSales;
    private final boolean virtual;
    private final boolean downloadable;
    private final List<ProductDownload> downloads;
    private final int downloadLimit;
    private final int downloadExpiry;
    private final String externalURL;
    private final String buttonText;
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
    private final String averageRating;
    private final int ratingCount;
    private final TIntArrayList relatedIds;
    private final TIntArrayList upsellIds;
    private final TIntArrayList crossSellIds;
    private final int parentId;
    private final String purchaseNote;
    private final List<ProductCategory> categories;
    private final List<ProductTag> tags;
    private final List<ProductImage> images;
    private final List<ProductAttribute> attributes;
    private final List<ProductDefaultAttribute> defaultAttributes;
    private final TIntArrayList variations;
    private final TIntArrayList groupedProducts;
    private final int menuOrder;
    private final List<ProductMetadata> metadata;

    private Product(Builder builder) {
        id = builder.id;
        name = builder.name;
        slug = builder.slug;
        permalink = builder.permalink;
        dateCreated = builder.dateCreated;
        dateCreatedGMT = builder.dateCreatedGMT;
        dateModified = builder.dateModified;
        dateModifiedGMT = builder.dateModifiedGMT;
        type = builder.type;
        status = builder.status;
        featured = builder.featured;
        catalogVisibility = builder.catalogVisibility;
        description = builder.description;
        shortDescription = builder.shortDescription;
        sku = builder.sku;
        // According to doc, price would be a String??
        price = builder.price;
        regularPrice = builder.regularPrice;
        dateOnSaleFrom = builder.dateOnSaleFrom;
        dateOnSaleFromGMT = builder.dateOnSaleFromGMT;
        dateOnSaleTo = builder.dateOnSaleTo;
        dateOnSaleToGMT = builder.dateOnSaleToGMT;
        price_html = builder.price_html;
        onSale = builder.onSale;
        purchasable = builder.purchasable;
        totalSales = builder.totalSales;
        virtual = builder.virtual;
        downloadable = builder.downloadable;
        downloads = builder.downloads;
        downloadLimit = builder.downloadLimit;
        downloadExpiry = builder.downloadExpiry;
        externalURL = builder.externalURL;
        buttonText = builder.buttonText;
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
        averageRating = builder.averageRating;
        ratingCount = builder.ratingCount;
        relatedIds = builder.relatedIds;
        upsellIds = builder.upsellIds;
        crossSellIds = builder.crossSellIds;
        parentId = builder.parentId;
        purchaseNote = builder.purchaseNote;
        categories = builder.categories;
        tags = builder.tags;
        images = builder.images;
        attributes = builder.attributes;
        defaultAttributes = builder.defaultAttributes;
        variations = builder.variations;
        groupedProducts = builder.groupedProducts;
        menuOrder = builder.menuOrder;
        metadata = builder.metadata;
    }

    public static class Builder {
        public Product build() {
            return new Product(this);
        }

        private int id;
        private String name;
        private String slug;
        private String permalink;
        private Date dateCreated;
        private Date dateCreatedGMT;
        private Date dateModified;
        private Date dateModifiedGMT;
        private String type;
        private String status;
        private boolean featured;
        private String catalogVisibility;
        private String description;
        private String shortDescription;
        private String sku;
        // According to doc, price would be a String??
        private String price;
        private String regularPrice;
        private Date dateOnSaleFrom;
        private Date dateOnSaleFromGMT;
        private Date dateOnSaleTo;
        private Date dateOnSaleToGMT;
        private String price_html;
        private boolean onSale;
        private boolean purchasable;
        private int totalSales;
        private boolean virtual;
        private boolean downloadable;
        private List<ProductDownload> downloads;
        private int downloadLimit;
        private int downloadExpiry;
        private String externalURL;
        private String buttonText;
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
        private String averageRating;
        private int ratingCount;
        private TIntArrayList relatedIds;
        private TIntArrayList upsellIds;
        private TIntArrayList crossSellIds;
        private int parentId;
        private String purchaseNote;
        private List<ProductCategory> categories;
        private List<ProductTag> tags;
        private List<ProductImage> images;
        private List<ProductAttribute> attributes;
        private List<ProductDefaultAttribute> defaultAttributes;
        private TIntArrayList variations;
        private TIntArrayList groupedProducts;
        private int menuOrder;
        private List<ProductMetadata> metadata;

        public Builder id(int val) {
            id = val;
            return this;

        }

        public Builder name(String val) {
            name = val;
            return this;

        }

        public Builder slug(String val) {
            slug = val;
            return this;

        }

        public Builder permalink(String val) {
            permalink = val;
            return this;

        }

        public Builder dateCreated(Date val) {
            dateCreated = val;
            return this;

        }

        public Builder dateCreatedGMT(Date val) {
            dateCreatedGMT = val;
            return this;

        }

        public Builder dateModified(Date val) {
            dateModified = val;
            return this;

        }

        public Builder dateModifiedGMT(Date val) {
            dateModifiedGMT = val;
            return this;

        }

        public Builder type(String val) {
            type = val;
            return this;

        }

        public Builder status(String val) {
            status = val;
            return this;

        }

        public Builder featured(boolean val) {
            featured = val;
            return this;

        }

        public Builder catalogVisibility(String val) {
            catalogVisibility = val;
            return this;

        }

        public Builder description(String val) {
            description = val;
            return this;

        }

        public Builder shortDescription(String val) {
            shortDescription = val;
            return this;

        }

        public Builder sku(String val) {
            sku = val;
            return this;

        }

        // According to doc, price would be a String??
        public Builder price(String val) {
            price = val;
            return this;

        }

        public Builder regularPrice(String val) {
            regularPrice = val;
            return this;

        }

        public Builder dateOnSaleFrom(Date val) {
            dateOnSaleFrom = val;
            return this;

        }

        public Builder dateOnSaleFromGMT(Date val) {
            dateOnSaleFromGMT = val;
            return this;

        }

        public Builder dateOnSaleTo(Date val) {
            dateOnSaleTo = val;
            return this;

        }

        public Builder dateOnSaleToGMT(Date val) {
            dateOnSaleToGMT = val;
            return this;

        }

        public Builder price_html(String val) {
            price_html = val;
            return this;

        }

        public Builder onSale(boolean val) {
            onSale = val;
            return this;

        }

        public Builder purchasable(boolean val) {
            purchasable = val;
            return this;

        }

        public Builder totalSales(int val) {
            totalSales = val;
            return this;

        }

        public Builder virtual(boolean val) {
            virtual = val;
            return this;

        }

        public Builder downloadable(boolean val) {
            downloadable = val;
            return this;

        }

        public Builder downloads(List<ProductDownload> val) {
            downloads = val;
            return this;
        }

        public Builder downloadLimit(int val) {
            downloadLimit = val;
            return this;

        }

        public Builder downloadExpiry(int val) {
            downloadExpiry = val;
            return this;

        }

        public Builder externalURL(String val) {
            externalURL = val;
            return this;

        }

        public Builder buttonText(String val) {
            buttonText = val;
            return this;

        }

        public Builder taxStatus(String val) {
            taxStatus = val;
            return this;

        }

        public Builder taxClass(String val) {
            taxClass = val;
            return this;

        }

        public Builder manageStock(boolean val) {
            manageStock = val;
            return this;

        }

        public Builder stockQuantity(int val) {
            stockQuantity = val;
            return this;

        }

        public Builder stockStatus(String val) {
            stockStatus = val;
            return this;

        }

        public Builder backOrders(String val) {
            backOrders = val;
            return this;

        }

        public Builder backOrdersAllowed(boolean val) {
            backOrdersAllowed = val;
            return this;

        }

        public Builder soldIndividually(boolean val) {
            soldIndividually = val;
            return this;

        }

        public Builder weight(String val) {
            weight = val;
            return this;

        }

        public Builder dimensions(ProductDimension val) {
            dimensions = val;
            return this;

        }

        public Builder shippingRequired(boolean val) {
            shippingRequired = val;
            return this;

        }

        public Builder shippingTaxable(boolean val) {
            shippingTaxable = val;
            return this;

        }

        public Builder shippingClass(String val) {
            shippingClass = val;
            return this;

        }

        public Builder shippingClassId(int val) {
            shippingClassId = val;
            return this;

        }

        public Builder reviewsAllowed(boolean val) {
            reviewsAllowed = val;
            return this;

        }

        public Builder averageRating(String val) {
            averageRating = val;
            return this;

        }

        public Builder ratingCount(int val) {
            ratingCount = val;
            return this;

        }

        public Builder relatedIds(TIntArrayList val) {
            relatedIds = val;
            return this;

        }

        public Builder upsellIds(TIntArrayList val) {
            upsellIds = val;
            return this;

        }

        public Builder crossSellIds(TIntArrayList val) {
            crossSellIds = val;
            return this;

        }

        public Builder parentId(int val) {
            parentId = val;
            return this;

        }

        public Builder purchaseNote(String val) {
            purchaseNote = val;
            return this;
        }

        public Builder categories(List<ProductCategory> val) {
            categories = val;
            return this;
        }

        public Builder tags(
                List<ProductTag> val) {
            tags = val;
            return this;
        }

        public Builder images(
                List<ProductImage> val) {
            images = val;
            return this;
        }

        public Builder attributes(
                List<ProductAttribute> val) {
            attributes = val;
            return this;
        }


        public Builder defaultAttributes(
                List<ProductDefaultAttribute> val) {
            defaultAttributes = val;
            return this;
        }


        public Builder variations(TIntArrayList val) {
            variations = val;
            return this;

        }

        public Builder groupedProducts(TIntArrayList val) {
            groupedProducts = val;
            return this;

        }

        public Builder menuOrder(int val) {
            menuOrder = val;
            return this;

        }

        public Builder metadata(
                List<ProductMetadata> val) {
            metadata = val;
            return this;
        }

    }
}