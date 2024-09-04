package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private int hoursWorkedPerMonth;
    private double hourlyRate;

    public HourlyEmployee(String name, LocalDate hireDate, int hoursWorkedPerMonth, double hourlyRate) {
        super(name, hireDate);
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}