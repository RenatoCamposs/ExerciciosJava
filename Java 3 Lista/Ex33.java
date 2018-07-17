import java.util.Scanner;
import java.util.Arrays;
public class Ex33 {
public static void main (String[] args) {
	String A[]=new String[4];
	int i;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=3;i++){
		System.out.println("Entre com o nome da "+i+"° pessoa:");
		A[i]=L.nextLine();
	}
	System.out.print("\n\nEntre a forma de saída(1-Crescente,2-Decrescente)::");
	int V=L.nextInt();
	Arrays.sort(A);
	if(V==1){
		for(i=1;i<=3;i++){
			System.out.print("Ordem crescente\n\n");
			System.out.println(A[i]);
		}
	}
	if(V==2){
		for(i=1;i<=3;i--){
			System.out.print("Ordem decrescente\n\n");
			System.out.println(A[i]);
		}
	}
	else{
		System.out.print("Valor invalido!");
		
}
}
}