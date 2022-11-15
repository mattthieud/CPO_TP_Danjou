/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_heritag_danjou;

import Armes.*;
import Personnages.Guerrier;
import Personnages.Magicien;
import java.util.ArrayList;
import Personnages.*;


/**
 *
 * @author Utilisateur
 */
public class TP4_Heritag_Danjou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Epée Epée1 = new Epée("Excalibur",7,5); 
        System.out.println(Epée1) ;    
        
    Epée Epée2 = new Epée("Durandal",4,7);
        System.out.println(Epée2);
    
    Epée Epée3 = new Epée("Or",8,7);
        System.out.println(Epée3);
    
    Baton Baton1 =new Baton("Chêne", 4, 5);
    System.out.println(Baton1);
    
    Baton Baton2 =new Baton("Charme", 5, 6);
    System.out.println(Baton2);
     
    Baton Baton3 =new Baton("fer", 8, 5);
    System.out.println(Baton3);
    
    ArrayList <Arme> Narme= new ArrayList <Arme>();
    Narme.add(Epée1);
    Narme.add(Epée2);
    Narme.add(Baton1);
    Narme.add(Baton2);
    int taille =Narme.size();
    int longueur =taille-1;
    for (int i=0; i<longueur;i++){
    System.out.println(Narme.get(i)+",");
    
    }
    System.out.println(Narme.get(taille-1));
    
    Magicien Magicien1 = new Magicien("Gandalf",300,true);
        System.out.println(Magicien1);
    Magicien Magicien2 = new Magicien("Garcimore",44,false);
        System.out.println(Magicien2);
    
        
    Guerrier Guerrier1 = new Guerrier("Conan",78, false);
        System.out.println(Guerrier1);  
    Guerrier Guerrier2 = new Guerrier("Lannister",45, true);
        System.out.println(Guerrier2);  
     
    ArrayList <Personnage> Npersonnage= new ArrayList <Personnage>();
    Npersonnage.add(Guerrier1);
    Npersonnage.add(Guerrier2);
    Npersonnage.add(Magicien1);
    Npersonnage.add(Magicien2);
    taille =Npersonnage.size();
    longueur =taille-1;
    for (int i=0; i<longueur;i++){
    System.out.println(Npersonnage.get(i)+",");
    
    }
    System.out.println(Narme.get(taille-1));
    
     
Guerrier1.ajouterarme(Epée1);  
Guerrier1.ajouterarme(Epée2);
Guerrier1.ajouterarme(Baton3);
Magicien1.ajouterarme(Baton1);
Magicien1.ajouterarme(Baton2);
Magicien1.ajouterarme(Epée2);

Guerrier1.equiperarme("Excalibur");




}
}


