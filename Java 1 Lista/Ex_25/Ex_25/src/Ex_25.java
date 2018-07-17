import java.util.Scanner;
public class Ex_15 {
    public static void main(String[] args) {
    Scanner Z = new Scanner (System.in);
    Char C;
    System.out.print("\n M para Matutino \n V - Vespartino \n N - Noturno");
    System.out.print("\n Digite o turno em que você estuda");
    C=Z.nextLine();
    if(C=='M');{
    System.out.print("\n Bom Dia!");
    }
    if(C=='V');{
    System.out.print("\n Boa Tarde!");
    }
    if(C=='N');{
    System.out.print("\n Boa noite!");
    }
    else{
    System.out.print("\n Valor Inválido");
    }
    }
}