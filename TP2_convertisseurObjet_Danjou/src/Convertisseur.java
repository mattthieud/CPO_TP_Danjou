/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Matthieu
 */
class Convertisseur {
    
public int nbConversions;

    public Convertisseur() {
        
        int nbConversions = 0;
    }
   
    public String tostring() {

        return "nb de conversions" + nbConversions;
    

}
// creation de la variable qui va transformer la temperature qui est en celcius en Kelvin
public double CelciusVersKelvin(double tempC){
    double tempK;
    tempK = (double) (tempC + 273.15);
// on ajoute 273.15 pour obtenir des degrés   
    nbConversions+=1;
    
    return tempK ;
}
        
// creation de la variable qui va transformer la temperature qui est en Kelvin en Celcius
public double KelvinVersCelcius(double tempK){
    double tempC;
       
    tempC =(double)(tempK - 273.15);
nbConversions+=1;
    return tempC;
}
// creation de la variable qui va transformer la temperature qui est en celcius en Farenheit
public double CelciusVersFarenheit(double tempCelcius){
    double tempFarenheit;
    
    tempFarenheit = (double) (tempCelcius * (9.0/5)+ 32); 
    nbConversions+=1;
    // on ajoute 1 au nombre de conversion effectue depuis le debut 
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

    private static class string {

        public string() {
        }
    }
}
    

