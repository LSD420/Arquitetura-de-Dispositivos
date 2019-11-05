/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

/**
 *
 * @author Turma A
 */
public class Motorcycle extends Vehicle {
    public Motorcycle(){super();}
    public Motorcycle(int year, String brand, String model, double price, String color){
        super(year, brand, model, price, color);
        
    }

    @Override
    public String toString() {
        return "Year: "+getYear()+", Brand: "+getBrand()+", Model: "+getModel()+", Price: "+getPrice()+", Color: "+getColor();
    }
    
}
