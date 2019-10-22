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
public class CharacterDrawingUtilities {
    public static void drawElement(char a){
        System.out.print(a);
    }
    public static void drawNewLine(){
        System.out.println();
    }
    public static void drawHorizontalSegmentWith(char a,int b){
        for (int i = 0; i < b; i++) {
            drawElement(a);
        }
    }
    public static void drawFilledRectangleWith(char a,int b,int c){
        for (int i = 0; i < c; i++) {
            drawHorizontalSegmentWith(a,b);
            drawNewLine();
        }
    }
    public static void drawEmptyRectangleWith(char a,int b,int c){
        for (int i = 0; i < c; i++) {
            if (i==0 || i == c-1) {
                drawHorizontalSegmentWith(a,b);
                drawNewLine();
            }
            else{
                drawElement(a);
                for (int j = 0; j < b-2; j++) {
                    System.out.print(" ");
                }
                drawElement(a);
                drawNewLine();
            }
            
        }
    }
    
    
}
