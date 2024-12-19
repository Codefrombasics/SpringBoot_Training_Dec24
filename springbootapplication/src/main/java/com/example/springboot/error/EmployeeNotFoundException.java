package com.example.springboot.error;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String msg){
        super(msg);//calls super class Constructor
    }
}
