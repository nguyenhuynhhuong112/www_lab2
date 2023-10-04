package com.example.www_lab2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @JoinColumn(name = "image_id")
    private long imageId;
    @Column(name = "path")
    private String path;
    @Column(name = "alternative")
    private String alternative;
    public ProductImage() {
    }

    public ProductImage(Product product, long imageId, String path, String alternative) {
        this.product = product;
        this.imageId = imageId;
        this.path = path;
        this.alternative = alternative;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "product=" + product +
                ", imageId=" + imageId +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}
