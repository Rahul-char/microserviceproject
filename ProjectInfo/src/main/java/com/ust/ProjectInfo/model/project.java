package com.ust.ProjectInfo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class project {
    @Id
    private long projectId;

    private String projectName;

    private LocalDate projectStartDate;

    private LocalDate projectEndDate;

    private String description;

    private int teamMembers;

    private String projectManager;

    private String projectStatus;

    private double projectBudget;

    private String companyName;

    private long companyCode;
}
