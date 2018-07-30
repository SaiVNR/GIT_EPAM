package com.teja.builderexample;

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

        final String firstName = "Naga";

        final boolean isMarried = false;
        Employee employee = new Employee
                                .EmployeeBuilder(id, firstName)
                                .setIsMarried(isMarried)
                                .build();
        System.out.printf("ID : %d \n"
                          + "FirstName : %s \n"
                          + "Married(true/false) : %b",
                          employee.getID(),
                          employee.getFirstName(),
                          employee.isMarried());
    }
}
