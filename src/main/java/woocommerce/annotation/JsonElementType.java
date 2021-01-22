package woocommerce.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface JsonElementType {
    /**
     * 1 : String
     * 2 : Integer
     *
     * @return
     */
    int type() default 1;
}
