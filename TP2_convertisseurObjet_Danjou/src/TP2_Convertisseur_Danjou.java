
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

        double result = temperature.CelciusVersKelvin(45);

        System.out.println(result);

        double result1 = temperature.KelvinVersCelcius(100);

        System.out.println(result1);

        double result2 = temperature.KelvinVersFarenheit(-12);

        System.out.println(result2);

        System.out.println(temperature);

        double temp;

        Scanner sc;
        sc = new Scanner(System.in);

        int c;

        System.out.println("Bonjour, veuillez saisir une valeur");
        temp = sc.nextDouble();
        System.out.println("entrez la converstion que vous voulez faire? \n I)CelciusVersKelvin II) KelvinVersCecius III) FarenheitVersCelcius IV)CelciusVersFrenheit V) KelvinVersFarenheit VI) FarenheitVerskelvin  ");
        c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println("La température est " + temp + "K");
                break;
            case 2:
                temp = KelvinVersCelcius(temp);
                System.out.println("La température est " + temp + "C");
                break;
            case 3:
                temp = CelciusVersFarenheit(temp);
                System.out.println("La température est " + temp + "F");
                break;
            case 4:
                temp = FarenheitVersCelcius(temp);
                System.out.println("La température est " + temp + "C");
                break;
            case 5:
                temp = KelvinVersFarenheit(temp);
                System.out.println("La température est " + temp + "F");
                break;
            case 6:
                System.out.println("La température est " + temp + "K");
                break;
            default:

        }

    }

    private static double KelvinVersFarenheit(double temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double FarenheitVersCelcius(double temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double CelciusVersFarenheit(double temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static double KelvinVersCelcius(double temp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
