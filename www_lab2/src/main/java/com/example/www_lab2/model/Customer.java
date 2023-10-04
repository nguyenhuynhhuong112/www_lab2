package com.example.www_lab2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private long id;
    private String address;
    private String email;
    @Column(name = "cust_name")
    private String custName;
    @Column(name = "phone")
    private String phone;
    public Customer() {
    }

    public Customer(long id, String address, String email, String custName, String phone) {
        this.id = id;
        this.address = address;
        this.email = email;
        this.custName = custName;
        this.phone = phone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", custName='" + custName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
