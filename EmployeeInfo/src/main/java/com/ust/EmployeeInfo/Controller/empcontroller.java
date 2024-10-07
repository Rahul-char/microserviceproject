package com.ust.EmployeeInfo.Controller;

import com.ust.EmployeeInfo.Service.empservice;
import com.ust.EmployeeInfo.client.fullResponse;
import com.ust.EmployeeInfo.model.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ustemps")
public class empcontroller {

    @Autowired
    private empservice  service;

    @PostMapping("/addemp")
    public employee addemp(@RequestBody employee emp){
        return service.addemp(emp);
    }

    @GetMapping("/getemp/{companyCode}")
    public ResponseEntity<fullResponse> getemp(@PathVariable("companyCode") long companyCode){
        return ResponseEntity.ok(service.getemp(companyCode));
    }
}
