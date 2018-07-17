import java.util.Scanner;
public class Ex_11 {
    public static void main(String[] args) {
    Scanner M = new Scanner (System.in);
    int A, B, C;
    
    System.out.print("Entre com o primeiro Valor::");
    A=M.nextInt();
    System.out.print("Entre com o segundo Valor::");
    B=M.nextInt();    
    C=A-B;
    System.out.print("A diferença entre eles é:: "+ C );
    }
}