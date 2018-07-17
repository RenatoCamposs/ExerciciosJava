import java.util.Scanner; 
public class Ex_23 {
    public static void main(String[] args) {
    	Scanner V = new Scanner (System.in);
      int M;
        System.out.print("Digite o valor::");
        M=V.nextInt();
        if(M>0){
        	System.out.print("O Valor é positivo");
        }
        else if(M<0){
        	System.out.print("O Valor é Negativo");
        }
    }
}