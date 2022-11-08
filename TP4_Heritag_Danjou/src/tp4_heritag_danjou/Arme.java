/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_heritag_danjou;

/**
 *
 * @author Utilisateur
 */
public class Arme {
    String  nom;
    int    niveau_attaque;
public Arme(String unNom, int unniveau_attaque) {
        nom = unNom;
        niveau_attaque = unniveau_attaque;
      
    }
@Override  
 public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "l'arme " + nom +  "niveau d'attaque de " + niveau_attaque  ;   
 return chaine_a_retourner;
 }
 
}