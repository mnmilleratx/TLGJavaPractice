// src/test/java/com/hr/personnel/EmployeeTest.java
package com.hr.personnel;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    @Test
    public void testGetEmployeeInfo() {
        Employee emp = new Employee("Mike", LocalDate.of(2020, 2, 3));
        assertEquals("name = Mike, hireDate = 2020-02-03", emp.getEmployeeInfo());
    }

    @Test
    public void testWork() {
        Employee emp = new Employee("Mike", LocalDate.of(2020, 2, 3));
        assertEquals("Mike worked", emp.work());
    }
}
