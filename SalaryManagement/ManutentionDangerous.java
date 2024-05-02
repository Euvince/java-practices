package SalaryManagement;

import java.time.LocalDate;

public final class ManutentionDangerous extends ManutentionEmployee implements RisquesEmployees
{
    public ManutentionDangerous (int old, String lastName, String firstName, LocalDate startService, double NU) 
    {
        super(old, lastName, firstName, startService, NU);
    }

    public double affectMonthPrime () {
        return this.calculerSalaire() + 200;
    }

}
