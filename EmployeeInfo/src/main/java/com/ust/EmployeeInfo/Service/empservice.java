package com.ust.EmployeeInfo.Service;

import com.ust.EmployeeInfo.Repository.repository;
import com.ust.EmployeeInfo.client.fullResponse;
import com.ust.EmployeeInfo.client.project;
import com.ust.EmployeeInfo.feign.projectClient;
import com.ust.EmployeeInfo.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class empservice {

    @Autowired
    private repository repo;

    @Autowired
    private projectClient client;

    public employee addemp(employee emp) {
        employee e = new employee();
        e.setCompanyCode(emp.getCompanyCode());
        e.setName(emp.getName());
        e.setDepartment(emp.getDepartment());
        e.setDesignation(emp.getDesignation());
        e.setSkills(emp.getSkills());
        e.setEmail(emp.getEmail());
        e.setPhoneNumber(emp.getPhoneNumber());
        e.setAddress(emp.getAddress());
        e.setCity(emp.getCity());
        e.setState(emp.getState());
        e.setExp(emp.getExp());
        e.setDoj(emp.getDoj());
        return repo.save(e);
    }


    public fullResponse getemp(Long companyCode) {
     employee e = repo.findByCompanyCode(companyCode).orElse(null);
     List<project> l = client.getprojectbyComapnyCode(companyCode);
     fullResponse res = new fullResponse();
     res.setName(e.getName());
     res.setCompanyCode(e.getCompanyCode());
     res.setDepartment(e.getDepartment());
     res.setDesignation(e.getDesignation());
     res.setSkills(e.getSkills());
     res.setEmail(e.getEmail());
     res.setPhoneNumber(e.getPhoneNumber());
     res.setAddress(e.getAddress());
     res.setCity(e.getCity());
     res.setState(e.getState());
     res.setExp(e.getExp());
     res.setDoj(e.getDoj());
     res.setProjects(l);
     return res;
    }

}

