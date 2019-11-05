/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula6;

import aula5.Point;

/**
 *
 * @author Turma A
 */
public class Circle extends Shape {
    private double radius;
    public Circle(Point position, double radius){
        super(position);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
}
