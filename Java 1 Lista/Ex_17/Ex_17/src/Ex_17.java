import java.util.Scanner;
public class Ex_17 {
    public static void main(String[] args) {
            	int A, B, C, ad, sub, div, mult;
    Scanner Z = new Scanner (System.in);
    System.out.print("\n Digite o primeiro Valor::");
    A=Z.nextInt();
    System.out.print("\n Digite o segundo Valor::");
    B=Z.nextInt();
    System.out.print("\n 1 para Adição \n 2 para Subtração \n 3 para Divisão \n 4 para Multiplicação");
    System.out.print("\n\n Digite a operação a ser realizada::");
    C=Z.nextInt();
    ad=A+B;
    sub=A-B;
    div=A/B;
    mult=A*B;
    if(C==1){
    System.out.print("\n O Resultado da operação é " +  ad);
    }
    if(C==2){
    System.out.print("\n O Resultado da operação é " +  sub);
    }
    if(C==3){
    System.out.print("\n O Resultado da operação é " +  div);
    }
    if(C==4){
    System.out.print("\n O Resultado da operação é " +  mult);
    }
    }
}