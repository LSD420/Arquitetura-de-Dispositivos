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
public class Aula5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point a = new Point();
        Point b = new Point(10, 10);
        
        a.setX(10);
        
        double dist = a.distanceTo(b);
    }
    
}
