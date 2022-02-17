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
    
    public ConversorGrados() {
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public ConversorGrados(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }
    
    public double heittocelsius(double f){
        return ((f - 32) * 5 / 9);
    }
    
    public double celsiustofahrenheit(double c){
        return ((c * 9 / 5) + 32);
    }
    
}
