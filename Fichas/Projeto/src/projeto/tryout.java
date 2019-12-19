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
public class tryout {
    double uniMax = 0.0;
    double nCatapultas = 0.0;
    double nCavalaria = 0.0;
    double nInfantaria= 0.0;
    public double getUniMax() {
        return uniMax;
    }

    public void setUniMax(double uniMax) {
        this.uniMax = uniMax;
    }

    public void setnCatapultas() {
        this.nCatapultas = Math.round(Math.random() * ((this.uniMax - 1) + 1));
        this.uniMax= this.uniMax-this.nCatapultas;
    }

    public double getnCatapultas() {
        return nCatapultas;
    }

    public void setnCavalaria() {
        this.nCavalaria =Math.round(Math.random() * ((this.uniMax - 1) + 1));
        this.uniMax= this.uniMax-this.nCavalaria;
    }

    public double getnCavalaria() {
        return nCavalaria;
    }

    public void setnInfantaria() {
        this.nInfantaria = this.uniMax;
    }

    public double getnInfantaria() {
        return nInfantaria;
    }
}
