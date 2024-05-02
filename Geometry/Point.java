package Geometry;

public class Point 
{
    private double mAbscisse;
    private double mOrdonnee;

    public double getMAbscisse () {
        return this.mAbscisse;
    }

    public double getMOrdonnee () {
        return this.mOrdonnee;
    }

    public double setMAbscisse (double abscisse) {
        return this.mAbscisse = abscisse;
    }

    public double setMOrdonnee (double ordonnee) {
        return this.mOrdonnee = ordonnee;
    }

    public Point (double abscisse, double ordonnee)
    {
        this.mAbscisse = abscisse;
        this.mOrdonnee = ordonnee;
    }
}
