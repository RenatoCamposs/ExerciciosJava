import java.util.Scanner;
import java.util.Arrays;
public class Ex32 {
public static void main (String[] args) {
	int A[]=new int[21];
	int i,S=0;
	double M=0;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=20;i++){
		System.out.println("Entre com o valor do vetor "+i+"::");
		A[i]=L.nextInt();
		S=S+A[i];
	}
	M=S/20;
	System.out.println("\n\nA soma dos valores é:: "+S);
	System.out.println("A media dos valores é:: "+M);
}
}