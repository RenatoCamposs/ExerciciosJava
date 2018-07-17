import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
      Scanner V = new Scanner (System.in);
      int M,I;
      System.out.print("Digite o valor que deseja gerar a tabuada::");
      M=V.nextInt();
      for(I=0;I<=10;I++){
      System.out.print("\n " + M + "*" + I + " = " + M*I );
      }
      
    }
}