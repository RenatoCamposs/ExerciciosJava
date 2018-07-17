import java.util.Scanner;
import java.util.Arrays;
public class Ex35 {
public static void main (String[] args) {
	String A[]=new String[4];
	String MN[]=new String[4];
	double B[]=new double[4];double MA=0;
	int i;
	Scanner L=new Scanner(System.in);
	for(i=1;i<=3;i++){
		System.out.println("Entre com o nome da "+i+"° pessoa::");
		A[i]=L.nextLine();
		System.out.println("Entre com sua altura::");
		B[i]=L.nextInt();
		if(B[i]>MA){
			MA=B[i];
			MN[i]=A[i];
		}
	}
	System.out.println("A maior pessoa é a ::"+MN+"\nCom "+MA+" metros");
}
}