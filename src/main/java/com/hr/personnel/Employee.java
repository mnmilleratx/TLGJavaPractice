package com.hr.personnel;

import java.time.LocalDate;

public class Employee {
    String name;
    LocalDate hireDate;

    public Employee(String name, LocalDate hireDate) {
        this.name = name;
        this.hireDate = hireDate;
    }

    public String getEmployeeInfo() {
        return "Name = " + name + ", Hire Date = " + hireDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String work() {
       return name + " worked";
    }

    // Optional Exercise
    public int computeNumberOfYearsWorkedSinceHired() {
        return LocalDate.now().getYear() - hireDate.getYear();
    }
}
