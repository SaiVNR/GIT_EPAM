package com.teja.builderexample;
/**
 * @author Sai Teja
 *
 * Contains Builder class.
 */
public final class Employee {
    /** id of Employee.*/
    private int id;

    /** firstName of Employee.*/
    private String firstName;

    /** Maritial of Employee.*/
    private boolean isMarried;

    /**
     * @return ID of employee.
     */
    public int getID() {
        return id;
    }

    /**
     * @return FirstName of emploee.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return Whether employee is married or not.
     */
    public boolean isMarried() {
        return isMarried;
    }

    /**
     * @param builder Employee Builder object.
     */
    private Employee(final EmployeeBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.isMarried = builder.isMarried;
    }

    /**
     * @author Sai Teja
     * Employee Builder class
     *
     */
    public static class EmployeeBuilder {

        /** id of Employee.*/
        private int id;

        /** firstName of Employee.*/
        private String firstName;

        /** Maritial of Employee.*/
        private boolean isMarried;
        /**
         * @param idOfEmployee Id of employee.
         * @param firstNameOfEmployee FirstName of employee.
         */
        public EmployeeBuilder(final int idOfEmployee,
                               final String firstNameOfEmployee) {
            this.id = idOfEmployee;
            this.firstName = firstNameOfEmployee;
        }

        /**
         * @param isEmployeeMarried Married or not
         * @return EmployeeBuilder object.
         */
        public EmployeeBuilder setIsMarried(final boolean isEmployeeMarried) {
            this.isMarried = isEmployeeMarried;
            return this;
        }

        /**
         * @return Employee Object.
         */
        public Employee build() {
            return new Employee(this);
        }
    }
}
