package SalaryManagement;

import java.time.LocalDate;

public class ManutentionEmployee extends Employee
{
    protected double NH;

    /**
     * @return double return the NH
     */
    public double getNH() {
        return NH;
    }

    /**
     * @param NH the NH to set
     */
    public double setNH(double NH) {
        return this.NH = NH;
    }

    public ManutentionEmployee (int old, String lastName, String firstName, LocalDate startService, double NH) 
    {
        super(old, lastName, firstName, startService);
        this.NH = NH;
    }

    public double calculerSalaire () {
        return 5 * this.NH;
    }

    public void getNom () {
        System.out.println("L'employé de la Manutention " + this.lastName + " " + this.firstName);
    }

}
