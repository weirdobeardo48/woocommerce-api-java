package woocommerce.entity.product;

import java.time.LocalDateTime;

/**
 * @author TruongNX25
 */

public class ProductImage {
    private int id;
    private LocalDateTime dateCreated;
    private LocalDateTime dateCreatedGMT;
    private LocalDateTime dateModified;
    private LocalDateTime dateModifiedGMT;
    private String src;
    private String name;
    private String alt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTimeCreated() {
        return dateCreated;
    }

    public void setLocalDateTimeCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLocalDateTimeCreatedGMT() {
        return dateCreatedGMT;
    }

    public void setLocalDateTimeCreatedGMT(LocalDateTime dateCreatedGMT) {
        this.dateCreatedGMT = dateCreatedGMT;
    }

    public LocalDateTime getLocalDateTimeModified() {
        return dateModified;
    }

    public void setLocalDateTimeModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public LocalDateTime getLocalDateTimeModifiedGMT() {
        return dateModifiedGMT;
    }

    public void setLocalDateTimeModifiedGMT(LocalDateTime dateModifiedGMT) {
        this.dateModifiedGMT = dateModifiedGMT;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
}
