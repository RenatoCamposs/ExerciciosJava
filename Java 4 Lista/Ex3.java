import java.util.Scanner;
import java.util.Arrays;
public class Ex3 {
public static void main (String[] args) {
	int A[][]=new int[10][10];
	int i,j,v=0;
	Scanner L= new Scanner(System.in);
	for(i=0;i<=9;i++){
		for(j=0;j<=9;j++){
			if(i==0){
				System.out.println("Entre com o valor ["+i+"]["+j+"] da matriz::");
				A[i][j]=L.nextInt();
			}
			if(j==0 && i>0){
				System.out.println("Entre com o valor ["+i+"]["+j+"] da matriz::");
				A[i][j]=L.nextInt();
			}
		}
	}
		for(i=1;i<=9;i++){
			for(j=1;j<=9;j++){
				A[i][j]=A[v][j]+A[i][v];
			}}
		/*	A[i=1][j=1]=A[i=0][j=1]*A[i=1][j=0];
			A[i=2][j=1]=A[i=0][j=1]*A[i=2][j=0];
			A[i=3][j=1]=A[i=0][j=1]*A[i=3][j=0];
			A[i=4][j=1]=A[i=0][j=1]*A[i=4][j=0];
			A[i=5][j=1]=A[i=0][j=1]*A[i=5][j=0];
			A[i=6][j=1]=A[i=0][j=1]*A[i=6][j=0];
			A[i=7][j=1]=A[i=0][j=1]*A[i=7][j=0];
			A[i=8][j=1]=A[i=0][j=1]*A[i=8][j=0];
			A[i=9][j=1]=A[i=0][j=1]*A[i=9][j=0];
			
			
			A[i=1][j=2]=A[i=0][j=2]*A[i=1][j=0];
			A[i=2][j=2]=A[i=0][j=2]*A[i=2][j=0];
			A[i=3][j=2]=A[i=0][j=2]*A[i=3][j=0];
			A[i=4][j=2]=A[i=0][j=2]*A[i=4][j=0];
			A[i=5][j=2]=A[i=0][j=2]*A[i=5][j=0];
			A[i=6][j=2]=A[i=0][j=2]*A[i=6][j=0];
			A[i=7][j=2]=A[i=0][j=2]*A[i=7][j=0];
			A[i=8][j=2]=A[i=0][j=2]*A[i=8][j=0];
			A[i=9][j=2]=A[i=0][j=2]*A[i=9][j=0];
			
			
			A[i=1][j=3]=A[i=0][j=3]*A[i=1][j=0];
			A[i=2][j=3]=A[i=0][j=3]*A[i=2][j=0];
			A[i=3][j=3]=A[i=0][j=3]*A[i=3][j=0];
			A[i=4][j=3]=A[i=0][j=3]*A[i=4][j=0];
			A[i=5][j=3]=A[i=0][j=3]*A[i=5][j=0];
			A[i=6][j=3]=A[i=0][j=3]*A[i=6][j=0];
			A[i=7][j=3]=A[i=0][j=3]*A[i=7][j=0];
			A[i=8][j=3]=A[i=0][j=3]*A[i=8][j=0];
			A[i=9][j=3]=A[i=0][j=3]*A[i=9][j=0];
			
			
			A[i=1][j=4]=A[i=0][j=4]*A[i=1][j=0];
			A[i=2][j=4]=A[i=0][j=4]*A[i=2][j=0];
			A[i=3][j=4]=A[i=0][j=4]*A[i=3][j=0];
			A[i=4][j=4]=A[i=0][j=4]*A[i=4][j=0];
			A[i=5][j=4]=A[i=0][j=4]*A[i=5][j=0];
			A[i=6][j=4]=A[i=0][j=4]*A[i=6][j=0];
			A[i=7][j=4]=A[i=0][j=4]*A[i=7][j=0];
			A[i=8][j=4]=A[i=0][j=4]*A[i=8][j=0];
			A[i=9][j=4]=A[i=0][j=4]*A[i=9][j=0];
			
			A[i=1][j=5]=A[i=0][j=5]*A[i=1][j=0];
			A[i=2][j=5]=A[i=0][j=5]*A[i=2][j=0];
			A[i=3][j=5]=A[i=0][j=5]*A[i=3][j=0];
			A[i=4][j=5]=A[i=0][j=5]*A[i=4][j=0];
			A[i=5][j=5]=A[i=0][j=5]*A[i=5][j=0];
			A[i=6][j=5]=A[i=0][j=5]*A[i=6][j=0];
			A[i=7][j=5]=A[i=0][j=5]*A[i=7][j=0];
			A[i=8][j=5]=A[i=0][j=5]*A[i=8][j=0];
			A[i=9][j=5]=A[i=0][j=5]*A[i=9][j=0];
			
			A[i=1][j=6]=A[i=0][j=6]*A[i=1][j=0];
			A[i=2][j=6]=A[i=0][j=6]*A[i=2][j=0];
			A[i=3][j=6]=A[i=0][j=6]*A[i=3][j=0];
			A[i=4][j=6]=A[i=0][j=6]*A[i=4][j=0];
			A[i=5][j=6]=A[i=0][j=6]*A[i=5][j=0];
			A[i=6][j=6]=A[i=0][j=6]*A[i=6][j=0];
			A[i=7][j=6]=A[i=0][j=6]*A[i=7][j=0];
			A[i=8][j=6]=A[i=0][j=6]*A[i=8][j=0];
			A[i=9][j=6]=A[i=0][j=6]*A[i=9][j=0];
			
			A[i=1][j=7]=A[i=0][j=7]*A[i=1][j=0];
			A[i=2][j=7]=A[i=0][j=7]*A[i=2][j=0];
			A[i=3][j=7]=A[i=0][j=7]*A[i=3][j=0];
			A[i=4][j=7]=A[i=0][j=7]*A[i=4][j=0];
			A[i=5][j=7]=A[i=0][j=7]*A[i=5][j=0];
			A[i=6][j=7]=A[i=0][j=7]*A[i=6][j=0];
			A[i=7][j=7]=A[i=0][j=7]*A[i=7][j=0];
			A[i=8][j=7]=A[i=0][j=7]*A[i=8][j=0];
			A[i=9][j=7]=A[i=0][j=7]*A[i=9][j=0];
			
			A[i=1][j=8]=A[i=0][j=8]*A[i=1][j=0];
			A[i=2][j=8]=A[i=0][j=8]*A[i=2][j=0];
			A[i=3][j=8]=A[i=0][j=8]*A[i=3][j=0];
			A[i=4][j=8]=A[i=0][j=8]*A[i=4][j=0];
			A[i=5][j=8]=A[i=0][j=8]*A[i=5][j=0];
			A[i=6][j=8]=A[i=0][j=8]*A[i=6][j=0];
			A[i=7][j=8]=A[i=0][j=8]*A[i=7][j=0];
			A[i=8][j=8]=A[i=0][j=8]*A[i=8][j=0];
			A[i=9][j=8]=A[i=0][j=8]*A[i=9][j=0];
			
			A[i=1][j=9]=A[i=0][j=9]*A[i=1][j=0];
			A[i=2][j=9]=A[i=0][j=9]*A[i=2][j=0];
			A[i=3][j=9]=A[i=0][j=9]*A[i=3][j=0];
			A[i=4][j=9]=A[i=0][j=9]*A[i=4][j=0];
			A[i=5][j=9]=A[i=0][j=9]*A[i=5][j=0];
			A[i=6][j=9]=A[i=0][j=9]*A[i=6][j=0];
			A[i=7][j=9]=A[i=0][j=9]*A[i=7][j=0];
			A[i=8][j=9]=A[i=0][j=9]*A[i=8][j=0];
			A[i=9][j=9]=A[i=0][j=9]*A[i=9][j=0];*/
			
		System.out.print("\n\n\n ::Matriz definida:: \n\n");
	for(i=0;i<=9;i++){
		for(j=0;j<=9;j++){
			System.out.print("["+A[i][j]+"]");
				if(j==9){
					System.out.print("\n");
				}
	}}
}
}