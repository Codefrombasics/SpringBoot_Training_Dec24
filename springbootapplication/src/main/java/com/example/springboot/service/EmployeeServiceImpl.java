package com.example.springboot.service;

import com.example.springboot.entity.Employee;
import com.example.springboot.error.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

 private List<Employee> employees=new ArrayList<>();
    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return  employees.stream().filter(emp->emp.getEmpId().equals(id))
                .findFirst().
                orElseThrow(()-> new EmployeeNotFoundException("No Employee Found with Id "+id));

    }

@Override
    public Employee save(Employee employee) {
        if(employee.getEmpId()==null){
            employee.setEmpId(UUID.randomUUID().toString());
        }

        employees.add(employee);
        return employee;
    }

    @Override
    public String deleteEmployeeById(String id) {
        Employee deleteThisEmployee=employees.stream().filter(employee -> employee.getEmpId().equals(id)).findFirst().get();
        employees.remove(deleteThisEmployee);
        return "Deleted "+deleteThisEmployee.getEmpId()+" "+deleteThisEmployee.getEmpName();
    }
}
