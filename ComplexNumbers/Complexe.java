package ComplexNumbers;

public class Complexe 
{
    private double a;
    private double b;

    public double getA () {
        return this.a;
    }

    public double getB () {
        return this.b;
    }

    public double setA (double a) {
        return this.a = a;
    }

    public double setB (double b) {
        return this.b = b;
    }

    public Complexe (double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public void complexString () {
        String signe = new String("");
        signe = this.b >= 0 ? "+" : "";
        System.out.println("Voici le nombre complexe : " + this.a + signe + this.b + "i");
    }

    public void sum (Complexe c1) {
        double partieReelle = this.a + c1.a;
        double partieImaginaire = this.b + c1.b;
        System.out.println(
            "La somme des deux nombres complexes est : " + 
            partieReelle + (partieImaginaire >= 0 ? "+" : "") + 
            partieImaginaire + "i"
        );
    }

    public void product (Complexe c1) {
        double partieReelle = (this.a * c1.a) - (this.b * c1.b);
        double partieImaginaire = (this.a * c1.b) + (this.b * c1.a);
        System.out.println(
            "Le produit des deux nombres complexes est : " + 
            partieReelle + (partieImaginaire >= 0 ? "+" : "") + 
            partieImaginaire + "i"
        );
    }

    public void conjugue () {
        System.out.println("La forme conjuguée de : " + this + "est " + this.a + (this.b >= 0 ? "-" : "+") + (-this.b) + "i");
    }

    public double module () {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }

    public void carre () {
        System.out.println("Le carré de " + this + "est " + (Math.pow(this.a, 2) - Math.pow(this.b, 2)) + (2 * this.a * this.b) + "i");
    }

}
