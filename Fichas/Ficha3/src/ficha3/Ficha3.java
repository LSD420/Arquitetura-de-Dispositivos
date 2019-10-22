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
public class Ficha3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        incrementFirstOf(numbers);
        System.out.println(numbers[0]);
        //
        char a = CharacterUtilities.lowerLetterSuccessorOf('v');
        System.out.println(a);
        char b = CharacterUtilities.lowerLetterPredecessorOf('v');
        System.out.println(b);
        char c = CharacterUtilities.lowerLetterSuccessorStepsOf('z',5);
        System.out.println(c);
        char d = CharacterUtilities.lowerLetterPredecessorStepsOf('v',5);
        System.out.println(d);
        char[] carateres = {'a','g','d','w','s','a','g','y','e'};
        char[] carateres2 = {'a','b','c','d','e'};
        int e = CharacterUtilities.occurrencesOfCharacterIn(carateres,'a');
        System.out.println(e);
        char[] f = CharacterUtilities.replaceCharacterIn(carateres,'a','f');
        System.out.println(f);
        char[] g = CharacterUtilities.concatenationOf(carateres,carateres2);
        System.out.println(g);
        System.out.println("BATATA");
        char[] h = CharacterUtilities.copyOfPartOf(carateres,2,5);
        System.out.println(h);
        //
        char[] chiper = CaesarCipherDecipherer.cipher(carateres2,5);
        System.out.println(chiper);
        
    }

    static void incrementFirstOf(final int[] valores) {
        valores[0]++;
    }
    
}
