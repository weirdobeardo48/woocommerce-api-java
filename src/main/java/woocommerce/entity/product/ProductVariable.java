package woocommerce.entity.product;

import gnu.trove.list.array.TIntArrayList;

import java.util.Date;
import java.util.List;


/**
 * @author TruongNX25
 */

public class ProductVariable extends Product {
    /**
     * Reference: https://woocommerce.github.io/woocommerce-rest-api-docs/#product-properties
     */

    private final boolean featured;
    private final List<ProductCategory> categories;
    private final List<ProductDefaultAttribute> defaultAttributes;
    private final String averageRating;
    private final String buttonText;
    private final String catalogVisibility;
    private final String externalURL;
    private final TIntArrayList crossSellIds;
    private final TIntArrayList groupedProducts;

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

    public TIntArrayList getCrossSellIds() {
        return crossSellIds;
    }

    public TIntArrayList getGroupedProducts() {
        return groupedProducts;
    }

    public static class Builder extends Product.Builder<Builder> {
        private boolean featured;
        private List<ProductCategory> categories;
        private List<ProductDefaultAttribute> defaultAttributes;
        private String averageRating;
        private String buttonText;
        private String catalogVisibility;
        private String externalURL;
        private TIntArrayList crossSellIds;
        private TIntArrayList groupedProducts;

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

        public Builder setCrossSellIds(TIntArrayList crossSellIds) {
            this.crossSellIds = crossSellIds;
            return this;
        }

        public Builder setGroupedProducts(TIntArrayList groupedProducts) {
            this.groupedProducts = groupedProducts;
            return this;
        }

        @Override
        public ProductVariable build() {
            return new ProductVariable(this);
        }
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
}