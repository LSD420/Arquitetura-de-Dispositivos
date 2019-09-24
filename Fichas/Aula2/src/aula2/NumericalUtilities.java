/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;
import java.util.Scanner; 
/**
 *
 * @author Turma A
 */
public class NumericalUtilities {
     
        public static int powerOf(int a, int b){
            int n =a;
            for (int i = 1; i < b; i++) {
                n = n*a;
            }
            
            return n;
            
        }
        public static int sumOfNaturalNumbers(int a){
            int r = 0;
            if (a > 1){
                for (int i = 0; i <= a; i++) {
                    r += i;
                }
            }
            return r;
        }
        public static int sumOfNaturalNumbersBetween(int a, int b){
            int r =0;
            for (int i = a; i <= b; i++) {
                r +=i;
            }
            return r;
        }
        public static int sumOfEvenNumbersBetween(int a, int b){
            int r=0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0){
                    r+=i;
                }
                
            }
            return r;
        }
        public static int numberOfDivisorsOf(int a){
            int r = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i ==0) r++;
                
            }
            return r;
        }
        public static boolean isPrime(int a){
            int r=0;
            boolean v;
            for (int i = 1; i <= a; i++) {
                if (a % i ==0) r++;
                
            }
            if (r > 2) v = false;
            else v =true;
            return v;
            
            
        }
        
}
