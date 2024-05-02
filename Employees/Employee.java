package Employees;

public class Employee 
{

    private int mIndice;
    private String mName;
    private int mMatricule;
    private static double mValue = 120;

    public int getMIndice () {
        return this.mIndice;
    }

    public int setMIndice (int indice) {
        return this.mIndice = indice;
    }

    public String getMName () {
        return this.mName;
    }

    public String setMName (String name) {
        return this.mName = name;
    }

    public int getMMatricule () {
        return this.mMatricule;
    }

    public int setMMatricule (int matricule) {
        return this.mMatricule = matricule;
    }

    public double getMValue () {
        return Employee.mValue;
    }

    public double setMValue (double value) {
        return Employee.mValue = value;
    }

    public Employee (String name, int matricule, int indice) 
    {
        this.mName = name;
        this.mIndice = indice;
        this.mMatricule = matricule;
    }

    public double getSalaire () {
        return Employee.mValue * this.mIndice;
    }

    public void informations () {
        System.out.println(
            "Je m'appelle : " + this.mName + 
            ",avec pour matricule : " + 
            this.mMatricule + " et je reçois : " + 
            this.getSalaire() + " par mois."
        );
    }

}
