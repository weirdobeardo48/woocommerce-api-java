package woocommerce.entity.product;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.List;

/**
 * @author TruongNX25
 */

public class ProductAttribute {
    private int id;
    private String name;
    private int position;
    private boolean visible;
    private boolean variation;
    private List<String> options;
}
