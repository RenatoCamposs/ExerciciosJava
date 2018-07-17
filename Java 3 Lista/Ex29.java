import java.util.Scanner;
import java.util.Arrays;
public class Ex29 {
public static void main (String[] args) {
	int A[]=new int[31];
	int B[]=new int[31];
	int i;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=30;i++){
		System.out.println("Entre com o valor do "+i+" vetor::");
		A[i]= L.nextInt();
		if(A[i]<20){
			B[i]=A[i];
		}
		else if(A[i]>=20){
			B[i]=0;
		}
		
	}
	Arrays.sort(B);
	System.out.println("\n\nOs valores menores que 20 em ordem crescente são::");
	for(i=1;i<=30;i++){
		System.out.println(B[i]);
	}
	}
}