package com.example.CRUD.service;

import com.example.CRUD.model.Employee;
import com.example.CRUD.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
   private EmployeeRepository repository;

    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }
    public Optional<Employee> getEmployeeById(Long id){
        return repository.findById(id);
    }
    public Employee createEmployee(Employee employee){
       return repository.save(employee);
    }
    public Employee updateEmployee(Long id, Employee employeeDetails){
        Employee employee = repository.findById(id).orElseThrow(()->new RuntimeException("Employee not found"));
        employee.setName(employeeDetails.getName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setDepartment(employeeDetails.getDepartment());
        return repository.save(employee);
    };

    public void deleteEmployee(Long id){
         repository.deleteById(id);
    }


}
