import java.util.Scanner;
public class Ex_1 {
    
    public static void main(String[] args) {
    	Scanner T = new Scanner (System.in);
    	double  A,B,C,D,E,F;
    		System.out.print("Entre com a nota 1::");
    		A = T.nextDouble();
    		
    		System.out.print("Entre com a nota 2::");
    		B = T.nextDouble();
    		
    		System.out.print("Entre com a nota 3::");
    		C = T.nextDouble();
    		
    		System.out.print("Entre com a nota 4::");
    		D = T.nextDouble();
    		
    		E=A+B+C+D;
    		F=E/4;
    		
    		if (F >=8,5){
    			System.out.print( " APROVADO! " );
    		}
    		 if (F<8,5 && F>6){
    			System.out.print( " EXAME! " );
    		}
    		 if (F<=6){
    			System.out.print("RETIDO!");
    		}
    	}

    }
