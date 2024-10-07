package com.ust.ProjectInfo.Controller;


import com.ust.ProjectInfo.Service.service;
import com.ust.ProjectInfo.dto.projectDto;
import com.ust.ProjectInfo.model.project;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class controller {

    @Autowired
    private service s;

    @PostMapping("/addProject")
    public ResponseEntity<project> addProject(@RequestBody @Valid projectDto dto){
        return new ResponseEntity<>(s.addProject(dto), HttpStatus.CREATED);
    }

    @GetMapping("/getProject/{companyCode}")
    public ResponseEntity<List<project>> getProject(@PathVariable("companyCode") long companyCode){
        return ResponseEntity.ok(s.getProject(companyCode));
    }

}
