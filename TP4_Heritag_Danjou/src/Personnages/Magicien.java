/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;


/**
 *
 * @author Utilisateur
 */
public class Magicien extends Personnage {
    boolean confirme;

    public Magicien(String unNom, int unniveau_vie, boolean confirme) {
        super(unNom, unniveau_vie);
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
       if (confirme==true){
        return "Magicien{" +nom+ " "+niveau_vie +" "+" confirme";
       } else{ 
           return "Magicien{"+nom+ ""+ niveau_vie +""+"Debutant";
       }
    }
    
            
    
}
