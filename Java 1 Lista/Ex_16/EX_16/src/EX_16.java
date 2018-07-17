import java.util.Scanner;
public class EX_16 {
    
    public static void main(String[] args) {
    Scanner V = new Scanner (System.in);
    int I; 	  
    System.out.print("\n Digite a idade::");
    I=V.nextInt();
    if(I<=7 && I>=5){
    	System.out.print("\n Infantil A");
    }
    else if(I<=10 && I>=8){
    	System.out.print("\n Infantil B");	
    } 
      else if(I<=17 && I>=11){
    	System.out.print("\n Infantil C");	
    } 
      else if(I>=18){
    	System.out.print("\n Adulto");
    
      }else {
    	System.out.print("\n Idade não Registrada!");
    }
    
    }
}