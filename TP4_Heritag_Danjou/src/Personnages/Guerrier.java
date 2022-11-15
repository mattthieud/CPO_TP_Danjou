/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author Utilisateur
 */
public class Guerrier extends Personnage {
   boolean cheval;

    public Guerrier(String unNom, int unniveau_vie,boolean confirm) {
        super(unNom, unniveau_vie);
        this.cheval = cheval;
    }

    @Override
    public String toString() {
          if (cheval==true){
        return "Guerrier{" +nom+ " "+niveau_vie +" "+" cheval ";
       } else{ 
           return "Guerrier{"+nom+ ""+ niveau_vie +""+"Pied";
       }
    
    
    
    
    }  
}
