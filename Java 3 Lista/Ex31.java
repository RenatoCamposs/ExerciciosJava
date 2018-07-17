import java.util.Scanner;
import java.util.Arrays;
public class Ex31 {
public static void main (String[] args) {
	int A[]=new int[4];
	int i,SP=0,SI=0,C=0;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=3;i++){
		System.out.println("Entre com o valor do vetor "+i+"::");
		A[i]=L.nextInt();
		if(A[i]%2==0){
			SP=SP+A[i];
			C++;
		}
		else if(A[i]%2!=0){
			SI=SI+A[i];
		}
	}
	double M=SP/C;
	System.out.println("\n\nA media dos valores pares é::"+M);
	System.out.println("A soma dos valores impares é::"+SI);
}
}