/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula5;

/**
 *
 * @author Turma A
 */
public class Rectangle {
    private Point topLeftPoint;
    private double height;
    private double width;
    
    public Rectangle(){
        this.topLeftPoint = new Point();
        this.height = 0.0;
        this.width = 0.0;
    }
    
    public Rectangle(Point a,double b,double c){
        this.topLeftPoint = a;
        this.height = b;
        this.width = c;
    }

    public Point getTopLeftPoint() {
        return topLeftPoint;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setTopLeftPoint(Point topLeftPoint) {
        this.topLeftPoint = topLeftPoint;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double calculateArea(){
        return (height * width) / 2;
    }
    public double calculatePerimeter(){
        return (height * width) + 2;
    }
    public double inserted(Point a){
        return 2;
    }
    public boolean contains(Point point){
        boolean contains = false;
        Point TopRightCorner = new Point(topLeftPoint.getX() + width, topLeftPoint.getY());
        Point bottomRigthCorner = new Point(topLeftPoint.getX() + width, topLeftPoint.getY()- height);
        Point bottomLeftCorner = new Point(topLeftPoint.getX(), topLeftPoint.getY()-height);
        if (point.getX() > topLeftPoint.getX() && point.getX() < TopRightCorner.getX() && point.getY() > bottomRigthCorner.getY() && point.getY() < bottomLeftCorner.getY()){
        contains = true;
    }
        return contains;
    }

            
}
