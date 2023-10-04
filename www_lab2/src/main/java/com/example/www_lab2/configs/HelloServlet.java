package com.example.www_lab2.configs;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.www_lab2.db.Connection;
import com.example.www_lab2.model.Product;
import com.example.www_lab2.services.ProductServices;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "index", value = "/index")
public class HelloServlet extends HttpServlet {
    private ProductServices productServices;


    public HelloServlet() {
        productServices = new ProductServices();

    }

    public void init() {
        Connection.getInstance().getSessionFactory();
        productServices = new ProductServices();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
    public void destroy() {
    }


}