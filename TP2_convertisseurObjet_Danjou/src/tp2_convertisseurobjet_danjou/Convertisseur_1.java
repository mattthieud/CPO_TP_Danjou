/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_ConvertisseurObjet_Danjou;
import java.util.Scanner;
/**
 *
 * @author Matthieu
 */
public class Convertisseur {

    int nbConversions;

    public Convertisseur() {

        int nbConversions = 0;
    }
    @Override
    public string tostring() {

        return "nb de conversions" + nbConversions;
    

}

public double CelciusVersKelvin(double tempCelcius){
    double tempKelvin;
    tempKelvin = (double) (tempCelcius + 273.15);
   
    nbConversions+=1;
    
    return tempKelvin ;
}
        

public double KelvinVersCelcius(double tempKelvin){
    double tempCelcius;
       
    tempCelcius =(double)(tempKelvin - 273.15);
nbConversions+=1;
    return tempCelcius;
}

public double CelciusVersFarenheit(double tempCelcius){
    double tempFarenheit;
    
    tempFarenheit = (double) (tempCelcius * (9.0/5)+ 32); 
    nbConversions+=1;
        return tempFarenheit;
}

public double FarenheitVersCelcius ( double tempFarenheit){

double tempCelcius;

tempCelcius = (double) ((tempFarenheit-32)* (5.0/9));

nbConversions+=1;
    return tempCelcius;
}
public double KelvinVersFarenheit ( double tempKelvin ) {

double tempFarenheit;

tempFarenheit = (double) ((tempKelvin - 273.15)*9.0/5432) ;
nbConversions+=1;  
    return tempFarenheit;
}


public double FarenheitVerskelvin ( double tempFarenheit) {

double tempkelvin;

        double tempKelvin = (double) ((tempFarenheit-32) * (5.0/9)+273.15 );
nbConversions+=1;

return tempKelvin;
}

    double CelciusVersKelvin(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}