package SalaryManagement;

import java.time.LocalDate;

public abstract class Employee /* extends Object */
{
    protected int old;
    protected String lastName;
    protected String firstName;
    protected LocalDate startService; 

    /**
     * @return int return the old
     */
    public int getOld() {
        return old;
    }

    /**
     * @param old the old to set
     */
    public int setOld(int old) {
        return this.old = old;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public String setFirstName(String firstName) {
        return this.firstName = firstName;
    }

    /**
     * @return LocalDate return the startService
     */
    public LocalDate getStartService() {
        return startService;
    }

    /**
     * @param startService the startService to set
     */
    public LocalDate setStartService(LocalDate startService) {
        return this.startService = startService;
    }

    public Employee (int old, String lastName, String firstName, LocalDate startService) 
    {
        /* 
            this.old = old;
            this.lastName = lastName;
            this.firstName = firstName;
            this.startService = startService; 
        */

        setOld(old);
        setLastName(lastName);
        setFirstName(firstName);
        setStartService(startService);

    }

    public abstract double calculerSalaire ();

    public void getNom () {
        System.out.println("L'employé " + this.lastName + " " + this.firstName);
    }

}
