import java.util.Arrays;
class Main {

  public static int CalcularPerimetro(int base, int altura){
    int perimetro = 2*(base + altura);
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
    double calculador;
    for(int i=0;i<onze.lenght;i++){
      calculador = calculador + onze[i];
    }  
    calculador = calculador / onze.lenght;
    return calculador;
  }


  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] onze = {23,30,13,51,1,7};
    
    //7
    int p = CalcularPerimetro(2,2);
    System.out.println(p); 
    //8
    int v = CalcularVolume(10, 2, 5);
    System.out.println(v);
    //9
    double c = CalcularCelsius(120);
    System.out.println(c);
    //10


    //11
    int max = Arrays.stream(onze).max().getAsInt();
    int min = Arrays.stream(onze).min().getAsInt();
    double media = average;
    System.out.println("Min = " + min);
    System.out.println("Max = " + max);
    System.out.println("Média = " + media);
    
  }
}
