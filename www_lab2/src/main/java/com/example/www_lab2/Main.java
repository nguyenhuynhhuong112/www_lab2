package com.example.www_lab2;

import com.example.www_lab2.db.Connection;
import com.example.www_lab2.model.Product;
import com.example.www_lab2.services.ProductServices;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ProductServices().findAll();
        for (Product product : list) {
            System.out.println(product.getName());
        }
     }
}
