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
public class ArrayUtilities {
    public static String toString(int[] a){
        String str = "{";
        for (int i = 0; i < a.length; i++) {
            if (i== a.length){str += a[i]+"]";}
            else{str += a[i]+",";}
            
            str += a[i];
        }
        
        return str+"}";
            
    }
    public static int maximumOf(int[] a) {
        int max = a[0];        
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max)
                max = a[i];
        }
        return max;
    }
    public static int minimumOf(int[] a) {
        int min = a[0];        
        for (int i = 1; i < a.length; i++) {
            if(a[i] < min)
                min = a[i];
        }
        return min;
    }
    public static int[] copyOf(int[] a){
        int[] copia = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copia[i] = a[i];
        }
        
        return copia;
    }
    public static boolean contains(int[] a, int b){
        boolean vf = false;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                vf = true;
            }
        }
        return vf;
    }
    public static boolean containsDuplicates(int[] a){
        boolean vf = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length -1; j++) {
                if(a[i]==a[j]) vf=true;
            }
        }
        return vf;
    }
    public static int indexOf(int[] a, int b) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                index = i;
            }
        }
        return index;
    }
    public static int[] add(int[] a, int b){
        int[] adicionar = new int[a.length+1];
        for (int i = 0; i < a.length; i++) {
            adicionar[i] = a[i];
        }
        adicionar[adicionar.length-1] = b;
        return adicionar;
    } 
    public static int[] remove(int[] a, int b){
        int cont =0 ;
        int pos=0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] == b) {
                cont +=1;
            }
        }
        int[] remover = new int[a.length-cont];
        for (int i = 0; i < a.length; i++) {
            if (b!= a[i] ) {
                 remover[pos++] = a[i];
            }
        }
        /*for (int i = 0; i < a.length; i++) {
            remover[i] = a[i];
        }
        for (int j = 0; j < remover.length; j++) {
            if (remover[j] == b ) {
                
            }
        }
        //remover[numero] = b; */
        return remover; 
    }
    
}
