package com.example.www_lab2.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "product_price")
public class ProductPrice {
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    @Id
    @Column(name = "pice_date_time")
    private Date priceDateTime;
    @Column(name = "note", length = 255)
    private String note;
    @Column(name = "price")
    private double price;
    public ProductPrice() {
    }

    public ProductPrice(Product product, Date priceDateTime, String note, double price) {
        this.product = product;
        this.priceDateTime = priceDateTime;
        this.note = note;
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getPriceDateTime() {
        return priceDateTime;
    }

    public void setPriceDateTime(Date priceDateTime) {
        this.priceDateTime = priceDateTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "product=" + product +
                ", priceDateTime=" + priceDateTime +
                ", note='" + note + '\'' +
                ", price=" + price +
                '}';
    }
}
