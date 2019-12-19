/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author Turma A
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tryout x = new tryout();
        x.setUniMax(100);
        System.out.println(x.getUniMax());
        x.setnCatapultas();
        x.setnCavalaria();
        x.setnInfantaria();
        System.out.println(x.getnCatapultas());
        System.out.println(x.getnCavalaria());
        System.out.println(x.getnInfantaria());
        
    }
    
}
