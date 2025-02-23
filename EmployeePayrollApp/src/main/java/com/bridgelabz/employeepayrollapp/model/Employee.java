package com.bridgelabz.employeepayrollapp.model;




import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Name cannot be empty")
    private String name;

    @Min(value = 10000, message = "Salary must be at least 10000")
    private double salary;

    // Manually add a setter for id
    public void setId(Long id) {
        this.id = id;
    }
}
