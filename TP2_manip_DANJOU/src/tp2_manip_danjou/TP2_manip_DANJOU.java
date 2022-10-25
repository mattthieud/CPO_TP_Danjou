/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_danjou;

/**
 *
 * @author Utilisateur
 */
public class TP2_manip_DANJOU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        assiette2.nbCalories = 100;
        Tartiflette assiette3 = assiette2;
        // une seule tartiflette est  crée;
        System.out.println("nb decalories de Assiette1:"+ assiette1.nbCalories);
        System.out.println("nb de calories de Assiette2:" + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette3 :" + assiette3.nbCalories);
        assiette2 = assiette1;
        assiette1 = assiette3;
        // Aucune des deux propositions n'est juste   
        Moussaka[] tableau = new Moussaka[10];
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = new Moussaka(100 * (1 + i));
            if (i == tableau.length - 1) {
                System.out.println(tableau[i]);
            } else {
                System.out.println(tableau[i]);

            }
        }
    }
}
