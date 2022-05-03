package com.kimfri.food;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class StudentRepository {

    private final List<Student> students = new ArrayList<>();

    public StudentRepository() {
        students.addAll(Arrays.asList(
                new Student(1L, "Kim", "Fritzon-Ölander", LocalDate.of(1974, Month.JUNE, 30)),
                new Student(2L, "Maria", "Fritzon-Ölander", LocalDate.of(1976, Month.SEPTEMBER, 18))
        ));
    }

    Student getStudentById(Long id) {
        return students.stream()
                .filter(student -> student.getId() == id.longValue())
                .findFirst()
                .orElse(null);
    }

    List<Student> getStudents() {
        return new ArrayList<>(students);
    }
}
