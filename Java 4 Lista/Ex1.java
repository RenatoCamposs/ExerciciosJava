import java.util.Arrays;
import java.util.Scanner;
public class Ex1 {
public static void main (String[] args) {
	String A[][]=new String[10][2];
	String S[][]=new String[2][2];
	int i=0,j=0,V;
	Scanner L=new Scanner (System.in);
	for(i=0;i<=1;i++){
		for(j=0;j<=1;j++){
			if(j==0){
				System.out.println("Entre com o nome da "+(i+1)+"° pessoa::");
				A[i][j]=L.nextLine();
			}
			if(j==1){
				System.out.println("Entre com o seu número::");
				A[i][j]=L.nextLine();
			}
		}
	}
	System.out.print("\n\nDeseja realizar uma busca de nome?(1-SIM / 2-NÂO)::");
	V=L.nextInt();
	if(V==1){
				System.out.println("\n\nEntre com o número da pessoa que deseja::");
				S[1][1]=L.nextLine();
				S[1][1]=L.nextLine();
				for(i=0;i<=1;i++){
					for(j=0;j<=1;j++){
						if(S[1][1]==A[i][j]){
							System.out.println("O nome buscado foi...\n\nNOME::"+A[i][j-1]+"\tNÚMERO::"+A[i][j]);
						}
				}}
				
			}
	if(V==2){
				System.out.print("OK, fechando programa...");
			}
	if(V!=1 && V!=2){
		System.out.print("Valor inválido!");
	}
}
}