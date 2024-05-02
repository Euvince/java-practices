package SalaryManagement;

import java.util.ArrayList;

public class Personnel 
{

    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public ArrayList<Employee> getEmployees () {
        return this.employees;
    }

    public ArrayList<Employee> setEmployees (ArrayList<Employee> employees) {
        return this.employees = employees;
    }

    /* public Personnel () 
    {

    } */

    public void ajouterEmploye (Employee employee) {
        employees.add(employee);
    }

    public void afficherSalaires () {
        for (int i = 0; i < this.employees.size(); i++) {
            System.out.println("Le salaire de : " + this.employees.get(i).calculerSalaire());
        }
    }

    /* public double salaireMoyen () {

    } */

}
