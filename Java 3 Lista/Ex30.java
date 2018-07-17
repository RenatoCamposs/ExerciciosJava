import java.util.Scanner;
import java.util.Arrays;
public class Ex30 {
public static void main (String[] args) {
		int A[]=new int[31];
		int i;
		Scanner L=new Scanner(System.in);
		for(i=1;i<=30;i++){
			System.out.println("Entre com o valor do vetor "+i+"::");
			A[i]=L.nextInt();
			while(A[i]<10 || A[i]>20){
				System.out.println("Valor invalido! \nEntre novamente com o valor "+i+" do vetor::");
				A[i]=L.nextInt();
			}
		}
		Arrays.sort(A);
		System.out.println("\n\nOs valores aceitos em ordem crescente são::");
		for(i=1;i<=30;i++){
			System.out.println(A[i]);
		}
}
}