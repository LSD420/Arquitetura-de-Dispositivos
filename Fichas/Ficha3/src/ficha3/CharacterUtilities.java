/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha3;

/**
 *
 * @author Turma A
 */
public class CharacterUtilities {

    public static char lowerLetterSuccessorOf(char a) {
        char letra = a;
        if (a == 'z') {
            letra = 'a';
        } else {
            letra++;
        }
        return letra;
    }

    public static char lowerLetterPredecessorOf(char a) {
        char letra = a;
        if (a == 'a') {
            letra = 'z';
        } else {
            letra--;
        }
        return letra;
    }

    public static char lowerLetterSuccessorStepsOf(char a, int b) {
        char letra = a;
        for (int i = 0; i < b; i++) {
            if (letra == 'z') {
                letra = 'a';
            } else {
                letra++;
            }
        }
        return letra;
    }

    public static char lowerLetterPredecessorStepsOf(char a, int b) {
        char letra = a;
        for (int i = 0; i < b; i++) {
            if (letra == 'a') {
                letra = 'z';
            } else {
                letra--;
            }
        }
        return letra;
    }

    public static int occurrencesOfCharacterIn(char[] a, char b) {
        int contador = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                contador += 1;
            }
        }
        return contador;
    }

    public static char[] replaceCharacterIn(char[] a, char b, char c) {
        char[] batata = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            batata[i] = a[i];
            if (batata[i] == b) {
                batata[i] = c;
            }

        }
        return batata;
    }

    public static char[] concatenationOf(char[] a, char[] b) {
        char[] charfinal = new char[a.length+b.length];
        int teste = 0;
        int bolacha = 0;
        for (int i = 0; i < a.length; i++) {
            charfinal[i] = a[i];
            teste++;
        }
        for (int j = teste; j < teste+b.length; j++) {
            charfinal[j] = b[bolacha];
            bolacha++;
        }
        
        return charfinal;
    }
    
    public static char[] copyOfPartOf(char[] a, int b, int c) {
        char[] charfinal = new char[c-b+1];
        int bolacha= 0;
        for (int i = b; i <= c; i++) {
            charfinal[bolacha] = a[i];
            bolacha++;
        }
        return charfinal;
    }

    static char lowerLetterSuccessorStepsOf(char[] a, int steps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
