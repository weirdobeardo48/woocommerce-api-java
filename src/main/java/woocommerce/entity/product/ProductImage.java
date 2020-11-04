package woocommerce.entity.product;

import java.util.Date;

/**
 * @author TruongNX25
 */

public class ProductImage {
    private int id;
    private Date dateCreated;
    private Date dateCreatedGMT;
    private Date dateModified;
    private Date dateModifiedGMT;
    private String src;
    private String name;
    private String alt;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateCreatedGMT() {
        return dateCreatedGMT;
    }

    public void setDateCreatedGMT(Date dateCreatedGMT) {
        this.dateCreatedGMT = dateCreatedGMT;
    }

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Date getDateModifiedGMT() {
        return dateModifiedGMT;
    }

    public void setDateModifiedGMT(Date dateModifiedGMT) {
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
