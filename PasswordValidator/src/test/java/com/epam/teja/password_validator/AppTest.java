package com.epam.teja.password_validator;


import junit.framework.TestCase;

//TODO Password length should be greater than or equal to 8 Done
//TODO Password length should be less than or equal to 21 Done
//TODO Password should have at least one number Done
//TODO Password should have at least one lower case character Done
//TODO Password should have at least one upper case character Done
//TODO Password should have at least one of these characters [$,_,@,^,<,>,!] D
//TODO Password shouldn’t start with a number. done
//TODO Password shouldn’t start with special character.

/**
 * Unit test for Password Validation.
 */
public class AppTest extends TestCase {

    /**
     * PasswordValidator Object.
     */
    private PasswordValidator passwordValidator = new PasswordValidator();

    /**
     * Password validation.
     */
    public void testPasswordValidationLengthGreaterThan8() {
        assertTrue(passwordValidator.validateLength("abcdeghdafg"));
    }
    /**
     * Password validation.
     */
    public void testPasswordValidationLengthLessThan8() {
        assertFalse(passwordValidator.validateLength("abcde"));
    }    /**
     * Password validation.
     */
    public void testPasswordValidationLengthEqual8() {
        assertTrue(passwordValidator.validateLength("abcdefgh"));
    }
    /**
     * Password validation.
     */
    public void testPasswordValidationLengthGreaterThan20() {
        assertFalse(passwordValidator.validateLength("abcdeghdafgnfhsdajfjhf"));
    }
    /**
     * Password validation.
     */
    public void testPasswordValidationLengthLessThan20() {
        assertTrue(passwordValidator.validateLength("abcdesfasfg"));
    }    /**
     * Password validation.
     */
    public void testPasswordValidationLengthEqual20() {
        assertTrue(passwordValidator.validateLength("abcdeghdafgnfhsdajfj"));
    }

    /**
     * Password Validation - Containing one number or not.
     */
    public void testPasswordValidationContainsAtLeastOneNumber() {
        assertTrue(passwordValidator.validateAtLeastOneNumber("abc5tthut"));
        assertFalse(passwordValidator.validateAtLeastOneNumber("abcdefghjh"));
    }

    /**
     * Password Validation - Containing one lower case character or not.
     */
    public void testPasswordValidationContainsAtLeastOneLowerCaseChar() {
        assertTrue(passwordValidator.validateAtLeastOneLowerCase("abc5tthut"));
        assertFalse(passwordValidator.validateAtLeastOneLowerCase("ABCDEFGG"));
    }

    /**
     * Password Validation - Containing one upper case character or not.
     */
    public void testPasswordValidationContainsAtLeastOneUpperCaseChar() {
        assertTrue(passwordValidator.validateAtLeastOneUpperCase("abcAtthut"));
        assertFalse(passwordValidator.validateAtLeastOneUpperCase("abc5tthut"));
    }

    /**
     * Password Validation - Containing one special character or not.
     */
    public void testPasswordValidationContainsAtLeastOneSpecialChar() {
        assertTrue(passwordValidator.validateAtLeastOneSpecialCase("abtt@hut"));
        assertFalse(passwordValidator.validateAtLeastOneSpecialCase("abtthut"));
    }

    /**
     * Password Validation - Checking the password should not start with Number.
     */
    public void testPasswordValidationDoesnotStartWithNumber() {
        assertTrue(passwordValidator.validateIsStartingWithNumber("9abtt@hut"));
        assertFalse(passwordValidator.validateIsStartingWithNumber("aabtthut"));
    }

    /**
     * Password Validation - Checking the password should not start
     *                       Special Character.
     */
    public void testPasswordValidationDoesnotSpecialCharacter() {
        assertTrue(passwordValidator
                   .validateIsStartingWithSpecialChar("@abtt@hut"));
        assertFalse(passwordValidator
                   .validateIsStartingWithSpecialChar("aabtthut"));
    }

    /**
     * Password Validation - Checking the password should not start
     *                       Special Character.
     */
    public void testPasswordValidationAllConditions() {
        assertTrue(passwordValidator
                   .validatePassword("a@yy7Aiua"));
        assertFalse(passwordValidator
                   .validatePassword("@yy7aiua"));
        assertFalse(passwordValidator
                .validatePassword("1yy7aiua"));
        assertFalse(passwordValidator
                .validatePassword("y7aiua"));
        assertTrue(passwordValidator
                .validatePassword("ysbdA7@aiua"));
    }

    /**
     * Password Validation - Checking the password should not contain
     *                       Invalid Special Character.
     */
    public void testInvalidSpecialCharacters() {
        assertTrue(passwordValidator
                   .validateIsContainingInvalidSpecialChar("ysbdA7aiua@,"));
        assertFalse(passwordValidator
                .validateIsContainingInvalidSpecialChar("ysbdA7aiua@"));
    }

}

