/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_danjou;

/**
 *
 * @author Utilisateur
 */
public class TP2_relation_1_Danjou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
voiture uneClio = new voiture ("Clio", "Renault", 5 ) ;
voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Personne bob = new Personne("Bobby", "Sixkiller");
Personne reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio +
"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;  
}
