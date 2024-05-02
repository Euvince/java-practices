package Rectangle;


public class Rectangle 
{
    private double mLargeur;
    private double mLongueur;

    public double getMLargeur () {
        return this.mLargeur;
    }

    public double getMLongueur () {
        return this.mLongueur;
    }

    public double setMLongeur (double longueur) {
        return this.mLongueur = longueur;
    }

    public double setMLargeur (double largeur) {
        return this.mLongueur = largeur;
    }

    public Rectangle (double longueur, double largeur) 
    {
        this.mLargeur = largeur;
        this.mLongueur = longueur;
    }

    public double surface () {
        return this.mLongueur * this.mLargeur;
    }

    public double perimetre () {
        return 2 * (this.mLongueur + this.mLargeur);
    }

    public void afficher () {
        System.out.println("La surface du Rectangle est : " + this.surface());
        System.out.println("Le Périmètre du Rectangle est : " + this.perimetre());
    }

}
