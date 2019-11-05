/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficha7;

import ficha7.Menu.Command;
import java.util.Scanner;

/**
 *
 * @author Turma A
 */
public class Menu {

    public enum Command {
        START, SAVE_GAME, LOAD_GAME, HIGH_SCORES, QUIT;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando: ");
        String op = scanner.nextLine();
        Command command = Command.valueOf(op);
        if (command == command.START) {
            System.out.println("Começar");
        }else if (command == command.SAVE_GAME) {
            System.out.println("Guardar");
        }else if (command == command.LOAD_GAME) {
            System.out.println("Carregar");
        }else if (command == command.HIGH_SCORES) {
            System.out.println("High Scores");
        }else if (command == Command.QUIT) {
            System.out.println("Sair");
        }
        
        switch(command){
            case START:
                System.out.println("Começar");
                break;
            case SAVE_GAME:
                System.out.println("Guardar");
                break;
            case LOAD_GAME:
                System.out.println("Carregar");
                break;
                
            case HIGH_SCORES:
                System.out.println("High Scores");
                break;
            case QUIT:
                System.out.println("Sair");
                break;
        }
    }
}
