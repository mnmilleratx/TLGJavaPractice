package com.hr.personnel;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testGetEmployeeInfo() {
        Employee emp = new Employee("Micah", LocalDate.of(2023, 4, 3));
        assertEquals("Name = Micah, Hire Date = 2023-04-03", emp.getEmployeeInfo());
    }

    @Test
    public void testWork() {
        Employee emp = new Employee("Micah", LocalDate.of(2023, 4, 3));
        assertEquals("Micah worked", emp.work());
    }

    @Test
    public void testComputeNumberOfYearsWorkedSinceHired() {
        Employee emp = new Employee("Micah", LocalDate.of(2023, 4, 3));
        int expectedYears = LocalDate.now().getYear() - 2023; // Calculate years worked since hired
        assertEquals(expectedYears, emp.computeNumberOfYearsWorkedSinceHired());
    }

}
