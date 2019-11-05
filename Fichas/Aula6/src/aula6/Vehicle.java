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
public class Vehicle {
    private int year;
    private String brand;
    private String model;
    private double price;
    private String color;
    public Vehicle(){}
    public Vehicle(int year, String brand, String model, double price, String color){
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.color = color;
    }
    public int getYear(){
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String toString(){
        return "Year: "+getYear()+", Brand: "+getBrand()+", Model: "+getModel()+", Price: "+getPrice()+", Color: "+getColor();
    }
    
}
