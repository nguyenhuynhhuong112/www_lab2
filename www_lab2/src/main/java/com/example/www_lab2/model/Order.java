package com.example.www_lab2.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private long id;
    @Column(name = "order_date" , nullable = false)
    private String orderDate;
    @ManyToOne
    @JoinColumn(name = "emp_id", nullable = false)
    private Employee employee;
    @ManyToOne
    @JoinColumn(name = "cust_id", nullable = false)
    private Customer customer;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderDetail> listOrderDetail;
    public Order() {
    }

    public Order(long id, String orderDate, Employee employee, Customer customer, List<OrderDetail> listOrderDetail) {
        this.id = id;
        this.orderDate = orderDate;
        this.employee = employee;
        this.customer = customer;
        this.listOrderDetail = listOrderDetail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getListOrderDetail() {
        return listOrderDetail;
    }

    public void setListOrderDetail(List<OrderDetail> listOrderDetail) {
        this.listOrderDetail = listOrderDetail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate='" + orderDate + '\'' +
                ", employee=" + employee +
                ", customer=" + customer +
                ", listOrderDetail=" + listOrderDetail +
                '}';
    }
}
