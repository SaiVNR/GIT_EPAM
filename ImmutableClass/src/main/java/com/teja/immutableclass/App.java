package com.teja.immutableclass;

/**
 * @author Sai Teja
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

        final int id = 151472;

        final int age = 21;

        final String firstName = "Naga";

        final String lastName = "Sai Teja";

        Employee employee = new Employee(id, age, firstName, lastName);

        System.out.println("Employee ID : " + employee.getID());
        System.out.println("Employee Age : " + employee.getAge());
        System.out.println("Employee First Name : " + employee.getFirstName());
        System.out.println("Employee Last Name : " + employee.getLastName());
    }
}
