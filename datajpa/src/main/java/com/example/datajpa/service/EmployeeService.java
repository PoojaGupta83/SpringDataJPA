package com.example.datajpa.service;

import com.example.datajpa.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long id);
    void createEmployee(Employee employee);
    void deleteEmployee(Long id);

}
