import java.util.Scanner;
import java.util.Arrays;
public class Ex8 {
public static void main (String[] args) {
	int A[][]=new int[10][15];
	int i,j,Soma=0;
	Scanner L=new Scanner(System.in);
	for(i=0;i<=9;i++){
		for(j=0;j<=14;j++){
			System.out.print("Entre com o valor ["+(i+1)+"]["+(j+1)+"] da matriz::");
			A[i][j]=L.nextInt();
			if(A[i][j]%2==0){
				Soma=Soma+A[i][j];
			}
		}
	}
	System.out.println("\n\nO somatório dos numeros pares é ::"+Soma);
}
}