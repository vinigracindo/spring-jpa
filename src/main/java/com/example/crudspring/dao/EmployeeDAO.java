package com.example.crudspring.dao;

import com.example.crudspring.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

  List<Employee> findAll();

  Employee findById(int theId);

  Employee save(Employee theEmployee);

  void deleteById(int theId);

}
