package com.teja.singletonexample;

/**
 * @author Sai Teja
 *
 * Contains SingleTon class.
 */
public final class Employee {

    /**Employee object.*/
    private static Employee instance;

    /**
     * Private Constructor.
     */
    private Employee() {
    }

    /**
     * @return Employee Employee instance.
     */
    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;

    }

}
