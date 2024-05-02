package ComplexNumbers;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Complexe c1 = new Complexe(2, 3);
        Complexe c2 = new Complexe(3, 2);

        c1.complexString();
        c2.complexString();

        c1.sum(c2);
        c1.product(c2);

        System.out.println("Le module de C1 est : " + c1.module());
        System.out.println("Le module de C2 est : " + c2.module());

        c1.conjugue();
        c2.conjugue();

        c1.carre();
        c2.carre();
    }
}
