package com.myprojects.idcardservice.service;
import com.myprojects.idcardservice.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    void saveEmployee(Employee employee);

    Optional<Employee> findEmployeeByNo(int empNo);

    List<Employee> findAllEmployees();
}
