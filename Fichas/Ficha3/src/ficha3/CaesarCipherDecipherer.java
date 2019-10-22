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
public class CaesarCipherDecipherer {
    public static char[] cipher(char[] a, int steps){
        char[] result = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = CharacterUtilities.lowerLetterSuccessorStepsOf(a,steps);
        }
        return result;
    }
}
