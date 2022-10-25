
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Utilisateur
 */
public class TP2_Convertisseur_Danjou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Convertisseur temperature = new Convertisseur();

        double result = temperature.CelciusVersKelvin(40);

        System.out.println(result);

        double result1 = temperature.KelvinVersCelcius(160);

        System.out.println(result1);

        double result2 = temperature.CelciusVersFarenheit(120);
        System.out.println(result2);

        double result3 = temperature.FarenheitVersCelcius(-15);
        System.out.println(result3);

        double result4 = temperature.KelvinVersFarenheit(50);
        System.out.println(result4);

        double result5 = temperature.FarenheitVerskelvin(110);
        System.out.println(result5);

        System.out.println(temperature);

        double temp;

        Scanner sc;
        sc = new Scanner(System.in);

        System.out.println("Bonjour, veuillez saisir une valeur");
        int a = sc.nextInt();
        System.out.println("entrez la converstion que vous voulez faire? \n 1)Celcius 2) Kelvin 3) Farenheit");
        int b = sc.nextInt();
        System.out.println("entrez la converstion que vous voulez faire? \n 1)Celcius 2) Kelvin 3) Farenheit");
        int c = sc.nextInt();

        if (a == 1 && b == 2) {
            double result12 = temperature.CelciusVersKelvin(c);
            System.out.println(result12);
        }
        if (a == 1 && b == 3) {
            double result13 = temperature.CelciusVersFarenheit(c);
            System.out.println(result13);
        }
        if (a == 2 && b == 1) {
            double result21 = temperature.KelvinVersCelcius(c);
            System.out.println(result21);
        }
        if (a == 2 && b == 3) {
            double result23 = temperature.KelvinVersFarenheit(c);
            System.out.println(result23);
        }
        if (a == 3 && b == 1) {
            double result31 = temperature.FarenheitVersCelcius(c);
            System.out.println(result31);
        }
        if (a == 3 && b == 2) {
            double result32 = temperature.FarenheitVerskelvin(c);
            System.out.println(result32);

        }
    }
}    