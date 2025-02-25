package com.bridgelabz.employeepayrollapp.dto;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeePayrollDTO {

    @NotBlank(message = "Name is mandatory")
    private String name;

    @Min(value = 1000, message = "Salary must be greater than 1000")
    private double salary;
}
