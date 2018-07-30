package com.teja.singletonexample;


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
        Employee employeeOne = Employee.getInstance();
        Employee employeeTwo = Employee.getInstance();
        assertTrue(employeeOne.hashCode() == employeeTwo.hashCode());
    }
}
