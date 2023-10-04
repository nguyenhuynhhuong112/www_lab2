package com.example.www_lab2.model;

import com.example.www_lab2.Enum.EmployeeStatus;
import jakarta.json.bind.annotation.JsonbDateFormat;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "emp_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "full_name", length = 150, nullable = false)
    private String fullname;
    @Column(name = "dob", nullable = false)
    @JsonbDateFormat(value = "yyyy-MM-dd")
    private LocalDateTime dob;
    @Column(name = "email", length = 150, unique = true)
    private String email;
    @Column(name = "phone", length = 15, nullable = false)
    private String phone;
    @Column(name = "address", length = 250, nullable = false)
    private String address;
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    private EmployeeStatus status;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Order>  listOrder;

    public Employee() {
    }

    public Employee(long id, String fullname, LocalDateTime dob, String email, String phone, String address, EmployeeStatus status, List<Order> listOrder) {
        this.id = id;
        this.fullname = fullname;
        this.dob = dob;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.status = status;
        this.listOrder = listOrder;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public List<Order> getListOrder() {
        return listOrder;
    }

    public void setListOrder(List<Order> listOrder) {
        this.listOrder = listOrder;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", listOrder=" + listOrder +
                '}';
    }
}
