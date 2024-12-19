package com.example.springboot.entity;

public class Employee {
    private String empId;
    private String empName;
    private String empDesination;

    public Employee() {
    }

    public Employee(String empId, String empName, String empDesination) {
        this.empId = empId;
        this.empName = empName;
        this.empDesination = empDesination;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesination() {
        return empDesination;
    }

    public void setEmpDesination(String empDesination) {
        this.empDesination = empDesination;
    }
}
