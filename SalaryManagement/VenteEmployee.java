package SalaryManagement;

import java.time.LocalDate;

public final class VenteEmployee extends Employee
{

    private double CA;

    /**
     * @return double return the CA
     */
    public double getCA() {
        return CA;
    }

    /**
     * @param CA the CA to set
     */
    public double setCA(double CA) {
       return this.CA = CA;
    }

    public VenteEmployee (int old, String lastName, String firstName, LocalDate startService, double CA) 
    {
        super(old, lastName, firstName, startService);
        this.CA = CA;
    }

    public double calculerSalaire () {
        return ((20 * this.CA) / 100) + 400;
    }

    public void getNom () {
        System.out.println("L'employé de la Vente " + this.lastName + " " + this.firstName);
    }

}
