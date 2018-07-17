import java.util.Scanner; 
public class Ex_13 {
    public static void main(String[] args) {
    Scanner V = new Scanner (System.in);
      int M;
      System.out.print("\n Entre com o valor correspondente ao mes::");
      M=V.nextInt();
      if(M==1){
      	System.out.print("\n Janeiro");
      }
        else if(M==2){
      	System.out.print("\n Fevereiro");
      }
      else if(M==3){
      	System.out.print("\n Março");
      }
      else if(M==4){
      	System.out.print("\n Abril");
      }
      else if(M==5){
      	System.out.print("\n Maio");
      }
      else if(M==6){
      	System.out.print("\n Junho");
      }
      else if(M==7){
      	System.out.print("\n Julho");
      }
      else if(M==8){
      	System.out.print("\n Agosto");
      }
      else if(M==9){
      	System.out.print("\n Setembro");
      }
      else if(M==10){
      	System.out.print("\n Outubro");
      }
      else if(M==11){
      	System.out.print("\n Novembro");
      }
      else if(M==12){
      	System.out.print("\n Dezembro");
      }
    }
}