package com.example.www_lab2.configs;

import com.example.www_lab2.services.ProductServices;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet(name = "productServlet", value = "/product")
public class ProductController extends HttpServlet {
    private ProductServices productServices;

    public ProductController() {
        productServices = new ProductServices();
    }

}
