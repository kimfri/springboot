# Student Api

## Table of content
* [Get](#get)
* [Student](#student)
* [Tod](#todo)
* [Table](#table)
* [Collapsable](#collapsable-text)

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

## Todo

* [ ] Task #1
* [x] Task #2

## Table

| Name | Current State | Next State |
| :------ |--------------:|:----------:|
| Kim |            cs |     ns     |


## Collapsable text

<details>
    <summary>Section Header</summary>

    Section body text that is hidden

1. Item #1
2. Item #2

</details>




