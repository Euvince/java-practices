package CopyArray1ValuesIntoArray2;


import java.util.Scanner;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau 1 : ");
        int size = sc1.nextInt();

        int[] tab1 = new int[size];
        int[] tab2 = new int[size];

        System.out.println("Les valeurs du tableau 1 sont : ");
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }
        System.out.println("Les valeurs du tableau 2 sont : ");
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

        for (int i = 0; i < tab1.length; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " du tableau 1 : ");
            tab1[i] = sc2.nextInt();
        }
        System.out.println("Les valeurs du tableau 1 sont : ");
        for (int i = 0; i < tab1.length; i++) {
            System.out.println(tab1[i]);
        }

        for (int i = 0; i < tab1.length; i++) {
            tab2[i] = tab1[i];
        }
        System.out.println("Les valeurs du tableau 2 sont : ");
        for (int i = 0; i < tab2.length; i++) {
            System.out.println(tab2[i]);
        }

        sc1.close();
        sc2.close();

    }
}
