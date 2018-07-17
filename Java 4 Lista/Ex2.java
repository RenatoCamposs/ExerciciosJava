import java.util.Scanner;
import java.util.Arrays;
public class Ex2 {
public static void main (String[] args) {
	int A[][]=new int[3][3];
	int B[][]=new int[3][3];
	int C[][]=new int[3][3];
	int i,j;
	Scanner L= new Scanner(System.in);
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++){
			System.out.println("Entre com o valor "+(i+1)+" da matriz A::");
			A[i][j]=L.nextInt();			
		}
	}
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++){
			System.out.println("Entre com o valor "+(i+1)+" da matriz B::");
			B[i][j]=L.nextInt();
			C[i][j]=B[i][j]-A[i][j];		
		}
	}
	System.out.print("::MATRIZ A::\n");
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++){
			System.out.print("["+A[i][j]+"]");
				if(j==2){
					System.out.print("\n");
				}
	}
}
	System.out.print("::MATRIZ B::\n");
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++){
			System.out.print("["+B[i][j]+"]");
				if(j==2){
					System.out.print("\n");
				}
	}
}
	System.out.print("::MATRIZ C::\n");
	for(i=0;i<=2;i++){
		for(j=0;j<=2;j++){
			System.out.print("["+C[i][j]+"]");
				if(j==2){
					System.out.print("\n");
				}
	}
}
}}