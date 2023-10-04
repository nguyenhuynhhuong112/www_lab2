package com.example.www_lab2.repositories;


import com.example.www_lab2.db.Connection;
import com.example.www_lab2.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ProductRepository {
    private final SessionFactory sessionFactory;

    public ProductRepository() {
        sessionFactory = Connection.getInstance().getSessionFactory();
    }
    public List<Product> findAll(){
        Transaction transaction = null;
        List<Product> products = null;
        try (Session session = sessionFactory.openSession()){
            transaction = session.beginTransaction();
            products = session.createNativeQuery("SELECT * FROM www_lab2.product;", Product.class).getResultList();
            transaction.commit();
            return products;
        }catch (Exception e){
            transaction.rollback();
            e.printStackTrace();
        }
        return null;
    }
}
