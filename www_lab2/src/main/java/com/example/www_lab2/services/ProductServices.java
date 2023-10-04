package com.example.www_lab2.services;

import com.example.www_lab2.model.Product;
import com.example.www_lab2.repositories.ProductRepository;

import java.util.List;

public class ProductServices {
    private ProductRepository productRepository;

    public ProductServices() {
        productRepository = new ProductRepository();
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
