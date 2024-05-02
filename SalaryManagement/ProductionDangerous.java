package SalaryManagement;

import java.time.LocalDate;

public final class ProductionDangerous extends ProductionEmployee implements RisquesEmployees
{
    public ProductionDangerous (int old, String lastName, String firstName, LocalDate startService, double NU) 
    {
        super(old, lastName, firstName, startService, NU);
    }

    public double affectMonthPrime () {
        return this.calculerSalaire() + 200;
    }

}
