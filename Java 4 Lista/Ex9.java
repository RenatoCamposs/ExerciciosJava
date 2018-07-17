import java.util.Scanner;
import java.util.Arrays;
public class Ex9 {
public static void main (String[] args) {
	int A[][]=new int[5][10];
	int i,j,SP=0,SI=0,ST=0,sp=0,si=0;
	double MP=0,MI=0,MT=0;
	Scanner L=new Scanner(System.in);
	for(i=0;i<=4;i++){
		for(j=0;j<=9;j++){
			System.out.print("Entre com o valor ["+(i+1)+"]["+(j+1)+"] da matriz ::");
			A[i][j]=L.nextInt();
			if(A[i][j]%2==0){
				SP=SP+A[i][j];
				sp++;}
			if(A[i][j]%2!=0){
				SI=SI+A[i][j];
				si++;}
			ST=ST+A[i][j];
		}
	}
	MP=SP/sp;
	MI=SI/si;
	MT=ST/50;
	System.out.print("\n\n Valores Pares!\n");
	System.out.println("Soma::"+SP);
	System.out.println("Média::"+MP);
	
	System.out.print("\n\n Valores Impares!\n");
	System.out.println("Soma::"+SI);
	System.out.println("Média::"+MI);
	
	System.out.print("\n\n Todos os Valores!\n");
	System.out.println("Soma::"+ST);
	System.out.println("Média::"+MT);
}
}