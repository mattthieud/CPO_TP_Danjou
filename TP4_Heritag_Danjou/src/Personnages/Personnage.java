/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author Utilisateur
 */
public class Personnage {
String nom;
int niveau_vie;
ArrayList<Arme>Tab2=new ArrayList<Arme>();
Arme Arme_en_main;
public static int nbPersonnage=0;
public Personnage(String unNom, int unniveau_vie) {
        nom = unNom;
        niveau_vie = unniveau_vie; 
        Arme_en_main=null;
        nbPersonnage++;
        
}
public void ajouterarme(Arme arme_a_ajouter){
    if (Tab2.size()<5){
        Tab2.add(Arme_en_main);
        
    }
}
public Arme getArme_en_main(){
    return Arme_en_main;
    
}
public void equiperarme(String Narme){
 for(int k=0;k<Tab2.size();k++){  
     if (Tab2.get(k).getNom().equals("Narme")){
         Arme_en_main=Tab2.get(k);
        System.out.println("l'Arme est choisi et équipé");
        
         
     }
 }
}
 String cdt;
 
 
@Override  
 public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = "l'arme " + nom +  "niveau de vie est " + niveau_vie + "l'arme en main est " + Arme_en_main  ;   
 return chaine_a_retourner;
}
}

