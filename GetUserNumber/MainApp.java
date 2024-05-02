package GetUserNumber;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) throws Exception
    {
        int compt = 0;
        String wantContinue = "";
        Scanner sc = new Scanner(System.in);
        do {
            wantContinue = "";
            try {
                    if (compt == 0) System.out.println();
                    System.out.print("Entrez un chiffre ou un nombre entier positif : ");
                    int number = sc.nextInt();
                    System.out.println();
                    System.out.println("Voici les nombres de 0 à " + number + ": ");
                    System.out.println();
                    for (int i = 0; i <= number; i++) {
                        System.out.println(i + "\n");
                    }
                    while (!wantContinue.equals("oui") && !wantContinue.equals("non")) {
                        System.out.print("Entrez Oui pour continuer et Non pour quitter : ");
                        InputStreamReader isr = new InputStreamReader(System.in);
                        BufferedReader bf = new BufferedReader(isr);
                        wantContinue = bf.readLine().toLowerCase();
                        if (wantContinue.equals("non")) {
                            System.out.println();
                            System.out.println("Programme terminé." + "\n");
                            break;
                        }
                        else if (!wantContinue.equals("oui")) {
                            System.out.println();
                            System.out.println("Entrée invalide." + "\n");
                        }
                        else compt++;
                    }
                    System.out.println();
                }
            catch (InputMismatchException exception) {
                System.out.println("Vous devez entrer un nombre");
                while (!wantContinue.equals("oui") && !wantContinue.equals("non")) {
                    System.out.print("Entrez Oui pour continuer et Non pour quitter : ");
                    InputStreamReader isr = new InputStreamReader(System.in);
                    BufferedReader bf = new BufferedReader(isr);
                    wantContinue = bf.readLine().toLowerCase();
                    if (wantContinue.equals("non")) {
                        System.out.println();
                        System.out.println("Programme terminé." + "\n");
                        break;
                    }
                    else if (!wantContinue.equals("oui")) {
                        System.out.println();
                        System.out.println("Entrée invalide." + "\n");
                    }
                    else compt++;
                }
                System.out.println();
            }
            catch (NoSuchElementException exception) {
                System.out.println("Aucune Entrée");
                break;
            }
        }
        while (wantContinue.equals("oui"));

        sc.close();
    }
}