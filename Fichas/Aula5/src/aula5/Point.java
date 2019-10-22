/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

import java.util.*;
/**
 *
 * @author Turma A
 */
public class Point {

    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }
    public void setXY(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double distanceTo(Point other){
        double distancia = Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
        return distancia;
    }
    

}
