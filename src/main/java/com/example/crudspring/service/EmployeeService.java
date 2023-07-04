package com.example.crudspring.service;

import com.example.crudspring.entity.Employee;

import java.util.List;

public interface EmployeeService {

  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);

}
