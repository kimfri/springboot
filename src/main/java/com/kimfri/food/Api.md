# Student Api

## Table of content
* [Get](#get)
* [Student](#student)
* [What](#what)

## Get

Root endpoint
> /api/v1

> /api/v1/student?id=x

> /api/v1/students

## Student
```java
public class Student {
  private Long id;
  private String firstname;
  private String lastname;
  private LocalDate dateOfBirth;
}
```

## What