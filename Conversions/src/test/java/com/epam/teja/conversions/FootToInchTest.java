package com.epam.teja.conversions;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Foot to Inch Conversion.
 */
public class FootToInchTest
    extends TestCase {
    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public FootToInchTest(final String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(FootToInchTest.class);
    }

    /**
     * Pass Test case.
     */
    public void testValidCase() {
        final double expectedValue = 144;
        final double testCaseValue = 12;
        assertEquals(expectedValue, new FootToInch().convert(testCaseValue));
    }

    /**
     * Fail Test Case.
     */
    public void testInvalidCase() {
        final double expectedValue = 144;
        final double testCaseValue = 11;
        assertFalse(expectedValue == new FootToInch().convert(testCaseValue));

    }
}


