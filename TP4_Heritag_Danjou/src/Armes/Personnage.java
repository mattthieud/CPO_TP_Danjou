/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Utilisateur
 */
public class Personnage {
String nom;
int niveau_vie;
public Personnage(String unNom, int unniveau_vie) {
        nom = unNom;
        niveau_vie = unniveau_vie;
        
}
@Override  
 public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "l'arme " + nom +  "niveau de vie est " + niveau_vie  ;   
 return chaine_a_retourner;
}
}

