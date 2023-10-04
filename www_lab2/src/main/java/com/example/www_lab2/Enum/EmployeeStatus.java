package com.example.www_lab2.Enum;

public enum EmployeeStatus {
    ACTIVE(1),
    INACTIVE(0),
    TERMINATED(-1);

    private int value;
    EmployeeStatus(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
