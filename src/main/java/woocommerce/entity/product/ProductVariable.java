package woocommerce.entity.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import gnu.trove.list.array.TIntArrayList;
import woocommerce.annotation.JsonElement;

import java.util.List;


/**
 * @author TruongNX25
 */

public class ProductVariable extends Product {
    /**
     * Reference: https://woocommerce.github.io/woocommerce-rest-api-docs/#product-properties
     */

    @JsonElement(key = "featured")
    private boolean featured;
    @JsonElement(key = "categories")
    private List<ProductCategory> categories;
    @JsonElement(key = "default_attributes")
    private List<ProductDefaultAttribute> defaultAttributes;
    @JsonElement(key = "average_rating")
    private String averageRating;
    @JsonElement(key = "button_text")
    private String buttonText;
    @JsonElement(key = "catalog_visibility")
    private String catalogVisibility;
    @JsonElement(key = "external_url")
    private String externalURL;
    @JsonElement(key = "cross_sell_ids")
    private List<Integer> crossSellIds;
    @JsonElement(key = "grouped_products")
    private List<Integer> groupedProducts;

    public boolean isFeatured() {
        return featured;
    }

    public List<ProductCategory> getCategories() {
        return categories;
    }

    public List<ProductDefaultAttribute> getDefaultAttributes() {
        return defaultAttributes;
    }

    public String getAverageRating() {
        return averageRating;
    }

    public String getButtonText() {
        return buttonText;
    }

    public String getCatalogVisibility() {
        return catalogVisibility;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public List<Integer> getCrossSellIds() {
        return crossSellIds;
    }

    public List<Integer> getGroupedProducts() {
        return groupedProducts;
    }

    public static class Builder extends Product.Builder<Builder> {
        @JsonProperty("featured")
        private boolean featured;
        @JsonProperty("categories")
        private List<ProductCategory> categories;
        @JsonProperty("default_attributes")
        private List<ProductDefaultAttribute> defaultAttributes;
        @JsonProperty("average_rating")
        private String averageRating;
        @JsonProperty("button_text")
        private String buttonText;
        @JsonProperty("catalog_visibility")
        private String catalogVisibility;
        @JsonProperty("external_url")
        private String externalURL;
        @JsonProperty("cross_sell_ids")
        private List<Integer> crossSellIds;
        @JsonProperty("grouped_products")
        private List<Integer> groupedProducts;

        public Builder setFeatured(boolean featured) {
            this.featured = featured;
            return this;
        }

        protected Builder self() {
            return this;
        }

        public Builder setCategories(List<ProductCategory> categories) {
            this.categories = categories;
            return this;
        }

        public Builder setDefaultAttributes(List<ProductDefaultAttribute> defaultAttributes) {
            this.defaultAttributes = defaultAttributes;
            return this;
        }

        public Builder setAverageRating(String averageRating) {
            this.averageRating = averageRating;
            return this;
        }

        public Builder setButtonText(String buttonText) {
            this.buttonText = buttonText;
            return this;
        }

        public Builder setCatalogVisibility(String catalogVisibility) {
            this.catalogVisibility = catalogVisibility;
            return this;
        }

        public Builder setExternalURL(String externalURL) {
            this.externalURL = externalURL;
            return this;
        }

        public Builder setCrossSellIds(List<Integer> crossSellIds) {
            this.crossSellIds = crossSellIds;
            return this;
        }

        public Builder setGroupedProducts(List<Integer> groupedProducts) {
            this.groupedProducts = groupedProducts;
            return this;
        }

        @Override
        public ProductVariable build() {
            return new ProductVariable(this);
        }

        public ProductVariable init() {
            return new ProductVariable();
        }
    }

    ProductVariable() {
        super();

    }

    private ProductVariable(Builder builder) {
        super(builder);
        featured = builder.featured;
        catalogVisibility = builder.catalogVisibility;
        externalURL = builder.externalURL;
        buttonText = builder.buttonText;
        averageRating = builder.averageRating;
        crossSellIds = builder.crossSellIds;
        categories = builder.categories;
        defaultAttributes = builder.defaultAttributes;
        groupedProducts = builder.groupedProducts;
    }

    @Override
    public String toString() {
        return "ProductVariable{" +
                "featured=" + featured +
                ", categories=" + categories +
                ", defaultAttributes=" + defaultAttributes +
                ", averageRating='" + averageRating + '\'' +
                ", buttonText='" + buttonText + '\'' +
                ", catalogVisibility='" + catalogVisibility + '\'' +
                ", externalURL='" + externalURL + '\'' +
                ", crossSellIds=" + crossSellIds +
                ", groupedProducts=" + groupedProducts +
                "} " + super.toString();
    }
}