package com.hr.personnel.client;

import com.hr.personnel.Employee;
import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Micah", LocalDate.of(2023, 4, 3));
        Employee emp2 = new Employee("Nala", LocalDate.of(2021, 11,10));

        System.out.println(emp1.getEmployeeInfo());
        System.out.println(emp2.getEmployeeInfo());
    }
}