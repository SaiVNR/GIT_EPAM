package com.epam.teja.password_validator;


import com.epam.teja.validators.Validators;

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

}

