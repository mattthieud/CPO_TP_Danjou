/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_danjou;

/**
 *
 * @author Utilisateur
 */
public class TP2_Bieres_Danjou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /*BouteilleBiere uneBiere = new BouteilleBiere();
        
        uneBiere.nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0;
        uneBiere.brasserie = "Dubuisson";
       */
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des Trolls", 7.0, "Dubuisson");

        uneBiere.lireEtiquette();
        
        
        /*BouteilleBiere uneautreBiere = new BouteilleBiere();
        
        uneautreBiere.nom = "Leffe";
        uneautreBiere.degreAlcool = 6.6;
        uneautreBiere.brasserie = "Abbaye de Leffe";
        */
        BouteilleBiere uneautreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere uneBiere3 = new BouteilleBiere( "Heineken", 5.0, "Cuvée Heineken");
        BouteilleBiere uneBiere4 = new BouteilleBiere("Chouffe", 8.0, "Chouffe");
        BouteilleBiere uneBiere5 = new BouteilleBiere("Cap dona", 7.0, "Cap Dona");
        System.out.println(uneBiere) ;
        boolean test;
        test=uneBiere.Décapsuler();
        System.out.println(uneBiere) ;

// TODO code application logic here
        
    }

}
