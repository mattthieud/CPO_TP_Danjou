/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4_heritag_danjou;

import java.util.ArrayList;

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
    
    Baton Baton1 =new Baton("Chêne", 4, 5);
    System.out.println(Baton1);
    
    Baton Baton2 =new Baton("Charme", 5, 6);
    System.out.println(Baton2);
        
    
    ArrayList <Arme> nom_Arme= new ArrayList <Arme>();
    nom_Arme.add(Epée1);
    nom_Arme.add(Epée2);
    nom_Arme.add(Baton1);
    nom_Arme.add(Baton2);
    
    
    
    
    
    
}
