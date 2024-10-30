package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.EmployeeDao;
import com.luv2code.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeDao employeeDao;

    public EmployeeServiceImpl(EmployeeDao theEmployeeDao) {
        employeeDao = theEmployeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }
}
