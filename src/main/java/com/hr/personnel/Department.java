package com.hr.personnel;

public class Department {
    private String name;
    private String location;
    private Employee[] employees = new Employee[100];
    private int currentIndex = 0;

    public void addEmployee(Employee employee) {
        if (currentIndex < employees.length) {
            employees[currentIndex++] = employee;
        }
    }

    public int letEmployeesWorkAndReturnNumberOfEmployeesWhoWorked() {
        int count = 0;
        for (int i = 0; i < currentIndex; i++) {
            if (employees[i].work().equals(employees[i].getName() + " worked")) {
                count++;
            }
        }
        return count;
    }
}