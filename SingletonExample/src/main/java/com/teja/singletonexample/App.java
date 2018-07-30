package com.teja.singletonexample;

/**
 * Hello world!
 *
 */
public final class App {

    /**
     * Private Constructor.
     */
    private App() {
    }
    /**
     * @param args Input.
     */
    public static void main(final String[] args) {
        Employee employeeOne = Employee.getInstance();
        Employee employeeTwo = Employee.getInstance();
        if (employeeOne.hashCode() == employeeTwo.hashCode()) {
            System.out.println("Employee is SingleTon class");
        } else {
            System.out.println("Employee is not SingleTon class");
        }
    }
}
