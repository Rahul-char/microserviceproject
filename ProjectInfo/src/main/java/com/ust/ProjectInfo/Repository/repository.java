package com.ust.ProjectInfo.Repository;

import com.ust.ProjectInfo.dto.projectDto;
import com.ust.ProjectInfo.model.project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface repository extends JpaRepository<project, Long> {

//    @Query(value = "SELECT * FROM project WHERE company_code = :companyCode", nativeQuery = true)
    List<project> findByCompanyCode(long companyCode);

}
