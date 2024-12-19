package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {
     List<Employee> getAllEmployees();
     Employee getEmployeeById(String id);
     Employee save(Employee employee);
     String deleteEmployeeById(String id);
}
