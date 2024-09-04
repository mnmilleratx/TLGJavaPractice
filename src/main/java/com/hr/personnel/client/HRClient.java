package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

public class HRClient {
    public static void main(String[] args) {
        Department department = new Department();

        SalariedEmployee emp1 = new SalariedEmployee("Mike", LocalDate.of(2020, 2, 3), 3000);
        HourlyEmployee emp2 = new HourlyEmployee("Sara", LocalDate.of(2021, 5, 10), 160, 20);

        department.addEmployee(emp1);
        department.addEmployee(emp2);

        System.out.println("Employees who worked: " + department.letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked());
    }
}