package com.epam.teja.password_validator;

import com.epam.teja.validators.Validators;

/**
 * @author Saiteja_Suggula
 *
 */
public class PasswordValidator {

	Validators validator = new Validators();
    /**
     * @param password Password to be validated.
     * @return Valid password or not based on all conditions.
     */
    public boolean validatePassword(final String password) {
        return validator.validateLength(password)
               && validator.validateAtLeastOneNumber(password)
               && validator.validateAtLeastOneUpperCase(password)
               && validator.validateAtLeastOneLowerCase(password)
               && validator.validateAtLeastOneSpecialCase(password)
               && !validator.validateIsStartingWithNumber(password)
               && !validator.validateIsStartingWithSpecialChar(password)
               && !validator.validateIsContainingInvalidSpecialChar(password);
    }

}
