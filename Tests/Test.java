package Tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test 
{
    public static void main(String[] args) throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(isr);
        System.out.print("Entrez Oui pour continuer et Non pour quitter : ");
        String choice1 = bf.readLine().toLowerCase();
        System.out.println(choice1.equals("oui"));
        bf.close();

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez Oui pour continuer et Non pour quitter : ");
        String choice2 = sc.nextLine().toLowerCase();
        System.out.println(choice2.equals("oui"));
        sc.close();
    }
}
