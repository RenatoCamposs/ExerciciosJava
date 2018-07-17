import java.util.Scanner;
import java.util.Arrays;
public class Ex27 {
public static void main (String[] args) {
	int A[]= new int[26];
	Scanner L=new Scanner (System.in);
	int i;
	for(i=1;i<=25;i++){
		System.out.println("Entre com o valor "+i+" do vetor::");
		A[i]=L.nextInt();
	}
	for(i=1;i<=25;i++){
		System.out.println("\n\nO valor quadrado do valor "+A[i]+" é:: "+A[i]*A[i]);
		System.out.println("O valor cubo do valor "+A[i]+" é:: "+A[i]*A[i]*A[i]);
		System.out.println("A raiz quadrada do valor "+A[i]+" é:: "+Math.sqrt(A[i]));
	}
	
}    
}