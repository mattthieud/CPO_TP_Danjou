/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author Utilisateur
 */
public class Arme {
    String  nom;
    int    niveau_attaque;
    int attaque ;
public Arme(String unNom, int unniveau_attaque) {
        nom = unNom;
        niveau_attaque = unniveau_attaque;
   
}       
public void setAttaque(int attaque) {
        if (attaque > 0){
            this.attaque= attaque;
        }
    }
@Override  
 public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "l'arme " + nom +  "niveau d'attaque de " + niveau_attaque  ;   
 return chaine_a_retourner;
 }

    public Object getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}