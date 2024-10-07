package com.ust.EmployeeInfo.feign;

import com.ust.EmployeeInfo.client.project;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name="projectInfo", url="http://localhost:9091/ust")
public interface projectClient {

    @GetMapping("/getProject/{companyCode}")
    public List<project> getprojectbyComapnyCode(@PathVariable("companyCode") long companyCode);


}
