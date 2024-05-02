package Geometry;

public class Cercle 
{
    private Point mCentre;
    private double mRayon;

    public Point getMCentre () {
        return this.mCentre;
    }

    public double getMRayon () {
        return this.mRayon;
    }

    public Point setMCentre (Point centre) {
        return this.mCentre = centre;
    }

    public double setMRayon (double rayon) {
        return this.mRayon = rayon;
    }

    public Cercle (Point centre, double rayon)
    {
        this.mRayon = rayon;
        this.mCentre = centre;
    }

    public double perimetre () {
        return 2 * Math.PI * this.mRayon;
    }

    public double surface () {
        return Math.PI * Math.pow(this.mRayon, 2);
    }

    public boolean testAppartenance (Point point) {
        double operation = Math.pow(point.getMAbscisse() - this.mCentre.getMAbscisse(), 2) + Math.pow(point.getMOrdonnee() - this.mCentre.getMOrdonnee(), 2);
        return operation == Math.pow(this.mRayon, 2) ? true : false;
    }

    /* public void afficher () {
        System.out.println("");
    } */

}
