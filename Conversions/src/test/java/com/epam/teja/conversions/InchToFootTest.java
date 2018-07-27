package com.epam.teja.conversions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Inch to Foot Conversion.
 */
public class InchToFootTest
    extends TestCase {
    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public InchToFootTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(InchToFootTest.class);
    }

    /**
     * Pass Test case.
     */
    public void testValidCase() {
        final double expectedValue = 0.1666666;
        final double testCaseValue = 2;
        assertEquals(expectedValue, new InchToFoot().convert(testCaseValue));
    }

    /**
     * Fail Test Case.
     */
    public void testInvalidCase() {
        final double expectedValue = 0.6096;
        final double testCaseValue = 4;
        assertFalse(expectedValue == new InchToFoot().convert(testCaseValue));

    }
}
