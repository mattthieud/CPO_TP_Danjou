/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_danjou;

/**
 *
 * @author Utilisateur
 */
public class Voiture {

    String modele;
    String marque;
    int PuissanceCV;
    Personne Proprietaire;

    public Voiture(String unmodele, String unemarque, int unePuissanceCV) {
        modele = unmodele;
        marque = unemarque;
        PuissanceCV = unePuissanceCV;
    }
    @Override
    public String toString(){
        String chaine_a_retourner;
        chaine_a_retourner ="\n modele:"+marque+
        "\npuissanceCV:"+PuissanceCV;
        return chaine_a_retourner;
              
    }

}
