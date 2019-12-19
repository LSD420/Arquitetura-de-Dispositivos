/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Game {
    Scanner myObj = new Scanner(System.in);
    public void Menu(){
        System.out.println("Menu:");
        System.out.println("1 - Criar Exércitos");
        System.out.println("2 - Inspecionar Exércitos");
        System.out.println("3 - Jogar");
        System.out.println("5 - sair");
        int op = myObj.nextInt();
        switch(op){
            case 1:
                System.out.println("");
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 5:
                
                break;
            default:
                System.out.println("Sair...");
        }
    }
        
}
