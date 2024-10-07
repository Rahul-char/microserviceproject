package com.ust.ProjectInfo.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDate;

@Data
public class projectDto {

    private long projectId;
    @NotNull(message = "project name should not be null")
    private String projectName;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;
    @NotNull
    private String description;
    @Min(value = 2, message = "team members should be greater than 2")
    @Max(value = 200, message = "team members should be less than 200")
    private int teamMembers;
    @NotBlank
    private String projectManager;
    @Pattern(regexp = "^(Inprogress|Completed)$")
    private String projectStatus;
    @Min(value = 1000)
    private double projectBudget;
    @NotBlank
    private String companyName;


    private long companyCode;
}
