import java.util.Scanner;
import java.util.Arrays;
public class Ex4 {
public static void main (String[] args) {
	int A[][]=new int[10][6];
	int B[]=new int[10];
	int i,j;
	Scanner L=new Scanner(System.in);
	for(i=0;i<=9;i++){
		for(j=0;j<=5;j++){
			System.out.println("Entre com o valor ["+(i+1)+"]["+(j+1)+"] da matris::");
			A[i][j]=L.nextInt();
			if(i==0){
				B[i]=B[i]+A[i][j];
			}
			if(i==1){
				B[i]=B[i]+A[i][j];
			}
			if(i==2){
				B[i]=B[i]+A[i][j];
			}
			if(i==3){
				B[i]=B[i]+A[i][j];
			}
			if(i==4){
				B[i]=B[i]+A[i][j];
			}
			if(i==5){
				B[i]=B[i]+A[i][j];
			}
			if(i==6){
				B[i]=B[i]+A[i][j];
			}
			if(i==7){
				B[i]=B[i]+A[i][j];
			}
			if(i==8){
				B[i]=B[i]+A[i][j];
			}
			if(i==9){
				B[i]=B[i]+A[i][j];
			}
		}
	}	
	System.out.print("\n\n::Matriz A::\n");
	for(i=0;i<=9;i++){
		for(j=0;j<=5;j++){
			System.out.print("["+A[i][j]+"]");
			if(j==5){
				System.out.print("\n");
			}
	}}
	System.out.print("\n\n::Matriz B::\n");
	for(i=0;i<=9;i++){
			System.out.print("["+B[i]+"]\n");
	}
	
}
}