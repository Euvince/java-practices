package Geometry;

public class MainApp 
{
    public static void main(String[] args) 
    {
        /* 
            Point A = new Point(5, 6);
            Point B = new Point(2, 3);
            System.out.println(A.getMAbscisse());
            System.out.println(A.getMOrdonnee()); 
        */

        Point C = new Point(3, 3);
        /* Cercle c1 = new Cercle(new Point(2, 3), 2);
        Cercle c2 = new Cercle(new Point(4, 5), 3); */
        Cercle c3 = new Cercle(new Point(2, 3), 1);

         /*
            System.out.println(c1.getMCentre().getMAbscisse());
            System.out.println(c1.getMCentre().getMOrdonnee());

            System.out.println(c1.getMCentre().setMAbscisse(10));
            System.out.println(c1.getMCentre().setMOrdonnee(15));

            System.out.println(c1.getMCentre().getMAbscisse());
            System.out.println(c1.getMCentre().getMOrdonnee());

            System.out.println(c2.getMCentre().getMAbscisse());
            System.out.println(c2.getMCentre().getMOrdonnee());

            c2.setMCentre(new Point(25, 40));

            System.out.println(c2.getMCentre().getMAbscisse());
            System.out.println(c2.getMCentre().getMOrdonnee());
        */

        /* System.out.println("La Surface du cercle 1 est : " + c1.surface());
        System.out.println("La Surface du cercle 2 est : " + c2.surface());

        System.out.println("Le Périmètre du cercle 1 est : " + c1.perimetre());
        System.out.println("Le Périmètre du cercle 2 est : " + c2.perimetre()); */

        System.out.println(c3.testAppartenance(C));

    }
}
