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

    public String work() {
       return name + " worked";
    }
}
