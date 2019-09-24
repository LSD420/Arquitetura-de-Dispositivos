/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adc1;
import static java.time.Clock.system;

/**
 *
 * @author Turma A
 */
public class AdC1 {
    
    public static int CalcularPerimetro(int base, int altura){
     int perimetro = 2*(base + altura)   ;
     return perimetro;
    }
    public static int CalcularVolume(int comprimento,int largura, int altura){
    int volume = comprimento * largura * altura;
    return volume;
  }
  public static double CalcularCelsius(double fahrenheit){
    double celsius = (fahrenheit -32)* 5 / 9;
    return celsius;
  }


  public static double average(){
    int l = 11;
    int[] onze = new int[40];
              
    //int[] onze = {23,30,13,51,1,7};
    double calculador = 0;
    for(int i=0;i<onze.lenght;i++){
      calculador = calculador + onze[i];
    }  
    calculador = calculador / onze.lenght;
    return calculador;
  }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int hi() {
        return 24;
    }

}
