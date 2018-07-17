import java.util.Scanner; 
public class Ex_9 {
    public static void main(String[] args) {
    Scanner V = new Scanner (System.in);
    int A,B,C,D;
    System.out.print("Informe o Tempo gasto na viagem arredondado \n em horas apenas::");
    A=V.nextInt();
    System.out.print("\n Informe a Velocidade Media da viagem::");
    B=V.nextInt();
    C=A*B;
    D=C/15;
    System.out.print("\n O total de litros gasto na viagem são::"+D+" Litros");	
    }
}