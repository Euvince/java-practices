package DisplayDayOfWeek;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Entrez le numéro d'un Jour de la semaine : ");
            int number = sc.nextInt();

            switch (number) {
                case 1:
                    System.out.println("Le jour de la semaine est : Lundi");
                break;
                case 2:
                    System.out.println("Le jour de la semaine est : Mardi");
                break;
                case 3:
                    System.out.println("Le jour de la semaine est : Mercredi");
                break;
                case 4:
                    System.out.println("Le jour de la semaine est : Jeudi");
                break;
                case 5:
                    System.out.println("Le jour de la semaine est : Vendredi");
                break;
                case 6:
                    System.out.println("Le jour de la semaine est : Samedi");
                break;
                case 7:
                    System.out.println("Le jour de la semaine est : Dimanche");
                break;
                default:
                    System.out.println("Numéro de jour invalide");
                break;
            }
        }
        catch (InputMismatchException exception) {

        }
        sc.close();
    }
}
