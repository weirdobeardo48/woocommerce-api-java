package woocommerce.entity.product;

import gnu.trove.list.array.TIntArrayList;



/**
 * @author TruongNX25
 */

public class ProductVariation extends Product {
    ProductVariation(Builder builder) {
        super(builder);
    }


    public static class Builder extends Product.Builder<Builder> {
        protected Builder self() {
            return this;
        }

        @Override
        public ProductVariation build() {
            return new ProductVariation(this);
        }


    }
}