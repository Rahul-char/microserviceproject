package com.ust.EmployeeInfo.client;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class project {
    private long projectId;

    private String projectName;

    private String projectStartDate;

    private String projectEndDate;

    private String description;

    private String teamMembers;

    private String projectManager;

    private String projectStatus;

    private double projectBudget;

    private String companyName;

    private long companyCode;
}
