import java.util.Scanner;
public class Ex_26 {
    
    public static void main(String[] args) {
    Scanner V = new Scanner (System.in);
    int D,I;
   
    System.out.print("\nDigite o numero correspondente ao dia::");
    D=V.nextInt();
    if(D==1){
    	System.out.print("Domingo");
    }   
    	 else if(D==2){
    	System.out.print("Segunda");
    }  
    	else if(D==3){
    	System.out.print("Terça");
    } 
    	else if(D==4){
    	System.out.print("Quarta");
    } 
    	else if(D==5){
    	System.out.print("Quinta");
    } 
    	else if(D==6){
    	System.out.print("Sexta");
    } 
    	else if(D==7){
    	System.out.print("Sabado");
    } 
    	else{
    		System.out.print("Erro!");
    	}
    }
}