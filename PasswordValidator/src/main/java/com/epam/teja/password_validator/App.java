package com.epam.teja.password_validator;

import java.util.Scanner;

/**
 * @author Saiteja_Suggula
 *
 */
public final class App {

    /**
     * Constructor.
     */
    private App() {

    }
    /**
     * @param args Console Input
     */
    public static void main(final String[] args) {
        System.out.println("Hello User!");
        System.out.println("Enter a password to test");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        PasswordValidator passwordValidator = new PasswordValidator();
        if (passwordValidator.validatePassword(data)) {
            System.out.println("Valid password");
        } else {
          System.out.println("Invalid password");
        }
    }
}
