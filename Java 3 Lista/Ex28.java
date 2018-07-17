import java.util.Scanner;
import java.util.Arrays;
public class Ex28 {
public static void main (String[] args) {
	int A[]=new int[31];
	int i,CP=0,SP=0;
	int CI=0,SI=0;
	double MP,PP,MI,PI;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=30;i++){
		System.out.println("Entre com o valor do vetor "+i+"::");
		A[i]=L.nextInt();
		if(A[i]%2==0){
			CP++;
			SP=SP+A[i];
		}
		if(A[i]%2!=0){
			CI++;
			SI=SI+A[i];
		}
	}
	MP=SP/30;
	MI=SI/30;
	PP=(CP*100)/30;
	PI=(CI*100)/30;
	System.out.print("\t\t::Pares::\t::Impares::");
	System.out.println("\nContagem::\t"+CP+"\t\t\t"+CI);
	System.out.println("\nSoma::\t\t"+SP+"\t\t\t"+SI);
	System.out.println("\nMedia::\t\t"+MP+"\t\t\t"+MI);
	System.out.println("\nPorcentagem::"+PP+"\t\t"+PI);
	
	
}
}