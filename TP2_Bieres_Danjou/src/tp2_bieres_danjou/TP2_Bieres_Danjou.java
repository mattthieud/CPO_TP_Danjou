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
        System.out.println(uneBiere) ;
        boolean test;
        test=uneBiere.Décapsuler();
        System.out.println(uneBiere) ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere uneautreBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        test=uneautreBiere.Décapsuler();
        System.out.println(uneautreBiere) ;
        uneautreBiere.lireEtiquette();
        
        BouteilleBiere uneBiere3 = new BouteilleBiere( "Heineken", 5.0, "Cuvée Heineken");
        test=uneBiere3.Décapsuler();
        System.out.println(uneBiere3) ;
        uneBiere3.lireEtiquette();
        
        BouteilleBiere uneBiere4 = new BouteilleBiere("Chouffe", 8.0, "Chouffe");
        test=uneBiere4.Décapsuler();
        System.out.println(uneBiere4) ;
        uneBiere4.lireEtiquette();
        
        BouteilleBiere uneBiere5 = new BouteilleBiere("Cap dona", 7.0, "Cap Dona");
        System.out.println(uneBiere5) ;
        test=uneBiere5.Décapsuler();
        System.out.println(uneBiere5) ;
        uneBiere5.lireEtiquette();
        
        
// TODO code application logic here

        
    }

}
