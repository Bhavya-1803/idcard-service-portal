package com.myprojects.idcardservice.service;

import com.myprojects.idcardservice.entity.Employee;
import com.myprojects.idcardservice.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface{

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public void saveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public Optional<Employee> findEmployeeByNo(int empNo) {
        Optional<Employee> employee = employeeRepo.findById(empNo);
        if(employee.isPresent())
            return employee;
        else
            return null;
    }

    @Override
    public List<Employee> findAllEmployees() {
        List<Employee> employees = employeeRepo.findAll();
        return employees;
    }
}
