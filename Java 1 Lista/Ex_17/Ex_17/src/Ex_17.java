import java.util.Scanner;
public class Ex_17 {
    public static void main(String[] args) {
            	int A, B, C, ad, sub, div, mult;
    Scanner Z = new Scanner (System.in);
    System.out.print("\n Digite o primeiro Valor::");
    A=Z.nextInt();
    System.out.print("\n Digite o segundo Valor::");
    B=Z.nextInt();
    System.out.print("\n 1 para Adi��o \n 2 para Subtra��o \n 3 para Divis�o \n 4 para Multiplica��o");
    System.out.print("\n\n Digite a opera��o a ser realizada::");
    C=Z.nextInt();
    ad=A+B;
    sub=A-B;
    div=A/B;
    mult=A*B;
    if(C==1){
    System.out.print("\n O Resultado da opera��o � " +  ad);
    }
    if(C==2){
    System.out.print("\n O Resultado da opera��o � " +  sub);
    }
    if(C==3){
    System.out.print("\n O Resultado da opera��o � " +  div);
    }
    if(C==4){
    System.out.print("\n O Resultado da opera��o � " +  mult);
    }
    }
}