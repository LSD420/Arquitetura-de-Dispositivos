/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

import java.util.Arrays;

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
        System.out.println("Parte2");
        int[] arraya = {1,2,3};
        String aa = ArrayUtilities.toString(arraya);
        System.out.println(aa);
        int[] arrayb = {2,54,23,1,6,34,9};
        int bb = ArrayUtilities.maximumOf(arrayb);
        System.out.println(bb);
        int cc = ArrayUtilities.minimumOf(arrayb);
        System.out.println(cc);
        int[] arrayd = {4,2,3,41,23,213,4};
        int[] dd = ArrayUtilities.copyOf(arrayd);
        System.out.println(Arrays.toString(dd));
        boolean ee = ArrayUtilities.contains(arrayd, 4);
        System.out.println(ee);
        boolean ff = ArrayUtilities.containsDuplicates(arrayd);
        System.out.println(ff);
        int gg = ArrayUtilities.indexOf(arrayb, 1);
        System.out.println(gg);
        int[] hh = ArrayUtilities.add(arrayd,4);
        System.out.println(Arrays.toString(hh));
        int[] ii = ArrayUtilities.remove(arrayd,213);
        System.out.println(Arrays.toString(ii));
        
        
    }    
}
