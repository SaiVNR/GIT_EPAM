package com.epam.teja.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validators {

    /**
     * @param password Password to be validated.
     * @return Valid password based on length or not.
     */
    public boolean validateLength(final String password) {
        boolean isPasswordValid = false;
        int passwordLength = password.length();
        final int minLength = 8;
        final int maxLength = 20;
        if (passwordLength >= minLength && passwordLength <= maxLength) {
            isPasswordValid = true;
        }
        return isPasswordValid;
    }

    /**
     * @param password Password to be validated.
     * @return Valid password or not based on containing at least one number.
     */
    public boolean validateAtLeastOneNumber(final String password) {

        boolean isContainingNumber = false;
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(password);
        isContainingNumber = matcher.find();

        return isContainingNumber;
    }

    /**
     * @param password Password to be validated.
     * @return Valid password or not based on having
     *         at least one lower case character.
     */
    public boolean validateAtLeastOneLowerCase(final String password) {

        boolean isContainingLowerCaseChar = false;
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        isContainingLowerCaseChar = matcher.find();

        return isContainingLowerCaseChar;
    }

    /**
     * @param password Password to be validated.
     * @return Valid password or not based on having
     *         at least one upper case character.
     */
    public boolean validateAtLeastOneUpperCase(final String password) {

        boolean isContainingUpperCaseChar = false;
        Pattern pattern = Pattern.compile("[A-Z]");
        Matcher matcher = pattern.matcher(password);
        isContainingUpperCaseChar = matcher.find();

        return isContainingUpperCaseChar;
    }
    /**
     * @param password Password to be validated.
     * @return Valid password or not based on having
     *         at least one special character.
     */
    public boolean validateAtLeastOneSpecialCase(final String password) {

        boolean isContainingSpecialChar = false;
        Pattern pattern = Pattern.compile("[$]|[_]|[<]|[>]|[!]|[@]|[\\^]");
        Matcher matcher = pattern.matcher(password);
        isContainingSpecialChar = matcher.find();

        return isContainingSpecialChar;
    }

    /**
     * @param password Password to be validated.
     * @return Valid password or not based on Starting character
     *          - should not start with number.
     */
    public boolean validateIsStartingWithNumber(final String password) {
        boolean isStartingWithNumber = false;

        String firstCharacter = String.valueOf(password.charAt(0));
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(firstCharacter);
        isStartingWithNumber = matcher.find();

        return isStartingWithNumber;
    }
    /**
     * @param password Password to be validated.
     * @return Valid password or not based on Starting character
     *          - should not start with Special character.
     */
    public boolean validateIsStartingWithSpecialChar(final String password) {
        boolean isStartingWithSpecialCharacter = false;

        String firstCharacter = String.valueOf(password.charAt(0));
        Pattern pattern = Pattern.compile("[$]|[_]|[<]|[>]|[!]|[@]|[\\^]");
        Matcher matcher = pattern.matcher(firstCharacter);
        isStartingWithSpecialCharacter = matcher.find();

        return isStartingWithSpecialCharacter;
    }

    /**
     * @param password Password to be validated.
     * @return Valid password or not based on Starting character
     *          - should not start contain invalid Special character.
     */
    public boolean validateIsContainingInvalidSpecialChar(
                                            final String password) {

        boolean isHavingInvalidSpecialCharacter = false;

        String pwd = password
                      .replaceAll("[a-zA-Z0-9]|[$]|[_]|[!]|[@]|[\\^]", "");
        if (pwd.length() > 0) {
            isHavingInvalidSpecialCharacter = true;
        }

        return isHavingInvalidSpecialCharacter;

    }


}
