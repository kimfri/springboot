package com.kimfri.food;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Student {
    private Long id;
    private String firstname;
    private String lastname;
    private LocalDate dateOfBirth;
}
