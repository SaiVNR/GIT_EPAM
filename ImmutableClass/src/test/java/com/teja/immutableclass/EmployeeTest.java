package com.teja.immutableclass;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EmployeeTest
    extends TestCase {
    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public EmployeeTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(EmployeeTest.class);
    }

    /**
     * Rigourous Test.
     */
    public void testApp() {

        final int id = 151472;

        final int age = 21;

        final String firstName = "Naga";

        final String lastName = "Sai Teja";

        Employee employee = new Employee(id, age, firstName, lastName);

        assertEquals(id, employee.getID());
        assertEquals(age, employee.getAge());
        assertFalse("teja".equals(employee.getLastName()));
    }
}


