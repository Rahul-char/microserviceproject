package com.ust.EmployeeInfo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class employee {

    @Id
    private long companyCode;

    private String Name;
    private String department;
    private String designation;
    private List<String> skills;
    private String email;
    private String phoneNumber;
    private String address;
    private String city;
    private String state;
    private int exp;
    private LocalDate doj;

}
