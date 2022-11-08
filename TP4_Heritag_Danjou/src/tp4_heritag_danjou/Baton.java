/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4_heritag_danjou;

/**
 *
 * @author Utilisateur
 */
public class Baton extends Arme{ 
    int age;
     public Baton (String unnom, int unniveau_attaque, int a){
    super(unnom , unniveau_attaque);
    if (a>0){
        age=a;
    } else {
        age=0;
    
    }
    
    
    }   
}
