import java.util.Scanner;
import java.util.Arrays;
public class Ex34 {
public static void main (String[] args) {
	int A[]=new int[4];
	int B[]=new int[4];
	int C[]=new int[4];
	int D[]=new int[4];
	int E[]=new int[4];
	int i;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=3;i++){
		System.out.print("Entre com o "+i+"° valor do vetor A:");
		A[i]=L.nextInt();
		B[i]=2*A[i];
		C[i]=2*(A[i]+B[i]);
		D[i]=2*(B[i]+C[i]);
		E[i]=2*(C[i]+D[i]);
	}
	System.out.print("::A::\t::B::\t::C::\t::D::\t::E::\n");
	for(i=1;i<=3;i++){
		System.out.println(A[i]+"\t\t"+B[i]+"\t\t"+C[i]+"\t\t"+D[i]+"\t\t"+E[i]);
	}
}
}