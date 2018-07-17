import java.util.Scanner;
public class Ex_6 {
    public static void main(String[] args) {
    	int A;
    Scanner V = new Scanner (System.in);
    System.out.print("Digite um valor::");
    A=V.nextInt();
    if(A>=10 && A<=50){
    	System.out.print(" Dentro da Faixa");
    }
    else{
    	System.out.print(" Fora da Faixa ");
    }
    
    }
}
