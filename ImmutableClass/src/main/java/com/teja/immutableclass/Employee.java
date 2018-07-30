package com.teja.immutableclass;

/**
 * @author Sai Teja
 *
 */
public class Employee {

    /** id of Employee.*/
    private final int id;

    /** age of Employee.*/
    private final int age;

    /** firstName of Employee.*/
    private final String firstName;

    /** lastName of Employee.*/
    private final String lastName;

    /**
     * @param idOfEmp ID of Employee
     * @param ageOfEmp AGE of Employee
     * @param firstNameOfEmp FIRST NAME of Employee
     * @param lastNameOfEmp LAST NAME of Employee
     */
    public Employee(
            final int idOfEmp,
            final int ageOfEmp,
            final String firstNameOfEmp,
            final String lastNameOfEmp) {
        id = idOfEmp;
        age = ageOfEmp;
        firstName = firstNameOfEmp;
        lastName = lastNameOfEmp;
    }

    /**
     * @return ID
     */
    public int getID() {
        return id;
    }

    /**
     * @return AGE
     */
    public int getAge() {
        return age;
    }

    /**
     * @return FIRST NAME
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return LAST NAME
     */
    public String getLastName() {
        return lastName;
    }






}
