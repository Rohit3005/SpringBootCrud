package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

@Autowired
EmployeeRepo employeeRepo;

    public Employee saveData(Employee employee) {


       return employeeRepo.save(employee);
    }

    public List<Employee> getAllData() {
        return (List<Employee>) employeeRepo.findAll();
    }

    public Employee updateData(int empId, Employee employee) {

        return employeeRepo.save(employee);
    }

    public void deleteData(int empId) {
        employeeRepo.deleteById(empId);
    }

}
