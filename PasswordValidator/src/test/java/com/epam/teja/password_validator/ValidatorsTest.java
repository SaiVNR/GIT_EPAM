package com.epam.teja.password_validator;

import com.epam.teja.validators.Validators;

import junit.framework.TestCase;

/**
 * @author Sai Teja
 *
 */
public class ValidatorsTest extends TestCase {

    /**
     * Validator Object.
     */
    private Validators validators = new Validators();

    /**
     * Password validation.
     */
    public void testPasswordValidationLengthGreaterThan8() {
        assertTrue(validators.validateLength("abcdeghdafg"));
    }
    /**
     * Password validation.
     */
    public void testPasswordValidationLengthLessThan8() {
        assertFalse(validators.validateLength("abcde"));
    }    /**
     * Password validation.
     */
    public void testPasswordValidationLengthEqual8() {
        assertTrue(validators.validateLength("abcdefgh"));
    }
    /**
     * Password validation.
     */
    public void testPasswordValidationLengthGreaterThan20() {
        assertFalse(validators.validateLength("abcdeghdafgnfhsdajfjhf"));
    }
    /**
     * Password validation.
     */
    public void testPasswordValidationLengthLessThan20() {
        assertTrue(validators.validateLength("abcdesfasfg"));
    }    /**
     * Password validation.
     */
    public void testPasswordValidationLengthEqual20() {
        assertTrue(validators.validateLength("abcdeghdafgnfhsdajfj"));
    }

    /**
     * Password Validation - Containing one number or not.
     */
    public void testPasswordValidationContainsAtLeastOneNumber() {
        assertTrue(validators.validateAtLeastOneNumber("abc5tthut"));
        assertFalse(validators.validateAtLeastOneNumber("abcdefghjh"));
    }

    /**
     * Password Validation - Containing one lower case character or not.
     */
    public void testPasswordValidationContainsAtLeastOneLowerCaseChar() {
        assertTrue(validators.validateAtLeastOneLowerCase("abc5tthut"));
        assertFalse(validators.validateAtLeastOneLowerCase("ABCDEFGG"));
    }

    /**
     * Password Validation - Containing one upper case character or not.
     */
    public void testPasswordValidationContainsAtLeastOneUpperCaseChar() {
        assertTrue(validators.validateAtLeastOneUpperCase("abcAtthut"));
        assertFalse(validators.validateAtLeastOneUpperCase("abc5tthut"));
    }

    /**
     * Password Validation - Containing one special character or not.
     */
    public void testPasswordValidationContainsAtLeastOneSpecialChar() {
        assertTrue(validators.validateAtLeastOneSpecialCase("abtt@hut"));
        assertFalse(validators.validateAtLeastOneSpecialCase("abtthut"));
    }

    /**
     * Password Validation - Checking the password should not start with Number.
     */
    public void testPasswordValidationDoesnotStartWithNumber() {
        assertTrue(validators.validateIsStartingWithNumber("9abtt@hut"));
        assertFalse(validators.validateIsStartingWithNumber("aabtthut"));
    }

    /**
     * Password Validation - Checking the password should not start
     *                       Special Character.
     */
    public void testPasswordValidationDoesnotSpecialCharacter() {
        assertTrue(validators
                   .validateIsStartingWithSpecialChar("@abtt@hut"));
        assertFalse(validators
                   .validateIsStartingWithSpecialChar("aabtthut"));
    }
    /**
     * Password Validation - Checking the password should not contain
     *                       Invalid Special Character.
     */
    public void testInvalidSpecialCharacters() {
        assertTrue(validators
                   .validateIsContainingInvalidSpecialChar("ysbdA7aiua@,"));
        assertFalse(validators
                .validateIsContainingInvalidSpecialChar("ysbdA7aiua@"));
    }

}
