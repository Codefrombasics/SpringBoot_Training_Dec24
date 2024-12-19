package com.example.springboot.controller;

import com.example.springboot.entity.Employee;
import com.example.springboot.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeService;
    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") String empId){

        return employeeService.getEmployeeById(empId);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee employee){

       return employeeService.save(employee);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployeeById(@PathVariable String id) {
               return employeeService.deleteEmployeeById(id);
    }
}
