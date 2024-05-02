package SalaryManagement;

import java.time.LocalDate;

public class ProductionEmployee extends Employee
{

    protected double NU;

    /**
     * @return double return the NU
     */
    public double getNU() {
        return NU;
    }

    /**
     * @param NU the NU to set
     */
    public double setNU(double NU) {
        return this.NU = NU;
    }

    public ProductionEmployee (int old, String lastName, String firstName, LocalDate startService, double NU) 
    {
        super(old, lastName, firstName, startService);
        this.NU = NU;
    }

    public double calculerSalaire () {
        return this.NU * 5;
    }

    public void getNom () {
        System.out.println("L'employé de la Production " + this.lastName + " " + this.firstName);
    }

}
