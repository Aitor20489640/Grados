/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grados;

/**
 *
 * @author Aitor
 */
public class ConversorGrados {
    private double celsius, fahrenheit;
    
    //Constructo vacio de la clase
    public ConversorGrados() {
    }
    
    //Setter para el atributo celsius
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
    
    //Setter para el atributo fahrenheit
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    
    //Getter para el atributo celsius
    public double getCelsius() {
        return celsius;
    }

    //Getter para el atributo fahrenheit
    public double getFahrenheit() {
        return fahrenheit;
    }
    
    // Consturctor con los dos atributos de la clase
    public ConversorGrados(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    
    //Metodo para convertir fahrenheit a celsius
    public double heittocelsius(double f){
        return ((f - 32) * 5 / 9);
    }
    
    //Metodo para convertir celsius fahrenheit
    public double celsiustofahrenheit(double c){
        return ((c * 9 / 5) + 32);
    }
    
}
