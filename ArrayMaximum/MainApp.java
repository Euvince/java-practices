package ArrayMaximum;


import java.util.Arrays;
import java.util.Scanner;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] tab = new int[5];
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Entrez la valeur " + (i + 1) + " du tableau : ");
            tab[i] = sc.nextInt();
        }
        System.out.println("Les éléments du tableau sont : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        Arrays.sort(tab);
        System.out.println("Le tableau trié devient : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        System.out.println("Le Maximum est : " + max);
        sc.close();
    }
}
