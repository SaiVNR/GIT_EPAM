package com.teja.builderexample;


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
        final int testId = 123;
        final String firstName = "Naga";

        final boolean isMarried = false;

        Employee employee = new Employee
                                .EmployeeBuilder(id, firstName)
                                .setIsMarried(isMarried)
                                .build();
        assertTrue("Naga".equals(employee.getFirstName()));
        assertFalse(employee.isMarried());
        assertFalse(testId == employee.getID());
    }
}
