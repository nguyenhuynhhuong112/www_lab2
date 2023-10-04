package com.example.www_lab2.model;

import com.example.www_lab2.Enum.ProductStatus;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", length = 20)
    private long id;
    @Column(name = "name" , length = 150,  nullable = false)
    private String name;
    @Column(name = "description" , length = 250)
    private String  description;
    @Column(name = "unit", length = 25)
    private String unit;
    @Column(name = "manufacturer_name", length = 100)
    private String manufacturerName;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private ProductStatus status;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductImage> listProductImage;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> listOrderDetail;
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ProductPrice> listProductPrice;

    public Product() {
    }

    public Product(long id, String name, String description, String unit, String manufacturerName, ProductStatus status, List<ProductImage> listProductImage, List<OrderDetail> listOrderDetail, List<ProductPrice> listProductPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
        this.listProductImage = listProductImage;
        this.listOrderDetail = listOrderDetail;
        this.listProductPrice = listProductPrice;
    }

    public Product(long id, String name, String description, String unit, String manufacturerName, ProductStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public List<ProductImage> getListProductImage() {
        return listProductImage;
    }

    public void setListProductImage(List<ProductImage> listProductImage) {
        this.listProductImage = listProductImage;
    }

    public List<OrderDetail> getListOrderDetail() {
        return listOrderDetail;
    }

    public void setListOrderDetail(List<OrderDetail> listOrderDetail) {
        this.listOrderDetail = listOrderDetail;
    }

    public List<ProductPrice> getListProductPrice() {
        return listProductPrice;
    }

    public void setListProductPrice(List<ProductPrice> listProductPrice) {
        this.listProductPrice = listProductPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", status=" + status +
                ", listProductImage=" + listProductImage +
                ", listOrderDetail=" + listOrderDetail +
                ", listProductPrice=" + listProductPrice +
                '}';
    }
}
