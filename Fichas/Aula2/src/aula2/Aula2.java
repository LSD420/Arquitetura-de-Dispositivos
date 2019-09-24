/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Turma A
 */
public class Aula2 {
    public static void main(String[] args) {
     
        int a = NumericalUtilities.powerOf(4, 3);
        System.out.println(a);
        int b = NumericalUtilities.sumOfNaturalNumbers(5);
        System.out.println(b);
        int c = NumericalUtilities.sumOfNaturalNumbersBetween(3,5);
        System.out.println(c);
        int d = NumericalUtilities.sumOfEvenNumbersBetween(4,8);
        System.out.println(d);
        int e = NumericalUtilities.numberOfDivisorsOf(10);
        System.out.println(e);
        boolean f = NumericalUtilities.isPrime(2);
        System.out.println(f);
        
    
    }    
}
