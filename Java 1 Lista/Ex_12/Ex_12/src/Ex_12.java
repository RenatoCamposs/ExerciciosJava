import java.util.Scanner;
public class Ex_12 {
    public static void main(String[] args) {
    Scanner V = new Scanner (System.in);
    double cresult1, fresult1, S=1.0, C=1.0, F=1.0 ;
    System.out.print("\n Você gostaria de converter a temperatura em: \n");
    System.out.print("\n 1 - Celsius para Fahrenheit");
    System.out.print("\n 2 - Fahrenheit para Celsius");
    System.out.print("\n Para o primeiro caso digite 1, para o segundo 2 ::");
    S=V.nextDouble();
    
    if(S==1){
    System.out.print("\n Digite o número em Celsius ::");
    C=V.nextDouble();
    fresult1=(C*1.8)+32;
    System.out.print("\n O valor da conversão é de " + fresult1 + "ºF");
    }
    
    if(S==2){
    System.out.print("\n Digite o numero em Fahrenheit ::");
    F=V.nextDouble();
    cresult1=(F-32)/1.8;
    System.out.print("\n O valor da conversão é de " + cresult1 + "ºC");
    }
    
    }
}