package woocommerce.annotation;

import woocommerce.entity.product.ProductDimension;

import java.time.LocalDateTime;

public enum TypeOfJsonElement {
    NONE(null),
    INTEGER(Integer.class),
    STRING(String.class),
    ISO8601_DATETIME(LocalDateTime.class),
    DIMENSION(ProductDimension.class),
    BACKORDERS(Boolean.class);

    public final Class typeOfTargetClass;
    TypeOfJsonElement(Class typeOfTargetClass) {
        this.typeOfTargetClass = typeOfTargetClass;
    }
}
