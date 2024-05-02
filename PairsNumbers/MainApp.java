package PairsNumbers;


/* import java.util.InputMismatchException; */
import java.util.Scanner;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre n");
        int number = sc.nextInt();
        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
        /* do {
            try {
                
            }
            catch (InputMismatchException exception) {

            }
        }
        while (); */
    }
}
