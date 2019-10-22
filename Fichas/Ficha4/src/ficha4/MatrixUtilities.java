/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha4;

/**
 *
 * @author Turma A
 */
public class MatrixUtilities {
    static void show(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println("");
        }
    }
    static boolean isMatrix(int[][] matrix){
        boolean v = true;
        int cont=matrix[0].length;
        for (int i = 0; i < matrix.length; i++) {
            if (cont != matrix[i].length) {
                v = false;
            }
        }
        return v;
    }
    static boolean isIdentity(int[][] matrix){
        boolean v = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][i] != 1){
                    v = false;
                }
                else if(i != j && matrix[i][j] != 0){
                    v=false;
                }
            }
        }
        return v;
    }
    static int[][] multiplyBy(int[][] matrix,int n){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] *= n;
            }
        }
        return matrix;
    }
    static boolean areCompatibleForSum(int[][] matrix, int[][] matrixb){
        boolean v = true;
        if (matrix.length != matrixb.length) {
            v=false;
        }
        else{
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != matrixb[i].length) {
                v =false;
            }
        }
        }
        return v;
    }
    static int[][] sumOf(int[][] matrix,int[][] matrixb){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] += matrixb[i][j];
            }
        }
        return matrix;
    }
    
}
