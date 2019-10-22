/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4;

import java.util.Arrays;

/**
 *
 * @author Turma A
 */
public class Ficha4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int[] studentNumbers = {20032,30312,25342,31432};
        final String[] courseAcronyms = {"AD","WEB-FE","WEB-BE"};
        final int[][] studentGrades = {
            {15,18,17},
            {18,10,11},
            {11,13,15},
            {10,19,16}
        };
        
        final int[][] identityMatrix = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        final int[][] noMatrix = {
            {1,0,0},
            {0,1,23},
            {0,2,3}
        };
        System.out.println("a");
        MatrixUtilities.show(identityMatrix);
        System.out.println("b");
        boolean b = MatrixUtilities.isMatrix(noMatrix);
        System.out.println(b);
        boolean c = MatrixUtilities.isIdentity(noMatrix);
        System.out.println(c);
        int[][] d = MatrixUtilities.multiplyBy(noMatrix,4);
        System.out.println(Arrays.deepToString(d));
        boolean e = MatrixUtilities.areCompatibleForSum(identityMatrix,noMatrix);
        System.out.println(e);
        boolean z = MatrixUtilities.areCompatibleForSum(noMatrix, noMatrix);
        if(z){
            int[][] f = MatrixUtilities.sumOf(noMatrix, noMatrix);
            System.out.println(Arrays.deepToString(f));
        }
        //3
//        CharacterDrawingUtilities.drawElement('s');
//        CharacterDrawingUtilities.drawNewLine();
//        CharacterDrawingUtilities.drawHorizontalSegmentWith('*',6);
//        System.out.println();
//        CharacterDrawingUtilities.drawFilledRectangleWith('*',6,3);
//        System.out.println();
        CharacterDrawingUtilities.drawEmptyRectangleWith('*',6,3);
        //Matrix
        
        //boolean isMatrix = MatrixUtilities.isMatrix
        //System.out.println("Is Matrix?: "+isMatrix);
        //booelan isIdentity = MatrixUtilities
        
        
        
        
    }
    
    
}
