package com.ust.EmployeeInfo.Repository;

import com.ust.EmployeeInfo.client.fullResponse;
import com.ust.EmployeeInfo.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface repository extends JpaRepository<employee, Long> {


    Optional<employee> findByCompanyCode(Long companyCode);
}
