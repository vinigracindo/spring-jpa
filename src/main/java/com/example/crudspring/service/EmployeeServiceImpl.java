package com.example.crudspring.service;

import com.example.crudspring.dao.EmployeeRepository;
import com.example.crudspring.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  private final EmployeeRepository employeeRepository;

  public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
    employeeRepository = theEmployeeRepository;
  }

  @Override
  public List<Employee> findAll() {
    return employeeRepository.findAll();
  }

  @Override
  public Employee findById(int theId) {
    Optional<Employee> optionalEmployee = employeeRepository.findById(theId);

    if (!optionalEmployee.isPresent()) {
      throw new RuntimeException("Did not find employee id - " + theId);
    }

    return optionalEmployee.get();
  }

  @Override
  public Employee save(Employee theEmployee) {
    return employeeRepository.save(theEmployee);
  }

  @Override
  public void deleteById(int theId) {
    employeeRepository.deleteById(theId);
  }
}
