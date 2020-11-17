package introdate;
// a munkába álló főbb adatai

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {

    // name: String
    private String name;

    // dateOfBirth: LocalDate
    private LocalDate dateOfBirth;

    // beginEmployment: LocalDateTime
    private LocalDateTime beginEmployment;

    // Employee(year: int, month: int, day: int, name: String)
    public Employee(int year, int month, int day, String name) {

        // DateOfBirth: LocalDate
        this.dateOfBirth = LocalDate.of(year, month, day);

        // Name: String
        this.name = name;

        // BeginEmployment = LocalDateTime
        this.beginEmployment = LocalDateTime.now();
    }

    // getDateOfBirth: LocalDate
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    // getName: String
    public String getName() {
        return name;
    }

    // getBeginEmployment = LocalDateTime
    public LocalDateTime getBeginEmployment() {
        return beginEmployment;
    }

    // setName: String
    public void setName(String name) {
        this.name = name;

    }

}
