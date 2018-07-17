import java.util.Scanner;
public class Ex_15 {
    public static void main(String[] args) {
            	int nasc, ano, C;
    Scanner Z = new Scanner (System.in);
    System.out.print("\n Digite o Ano do seu Nascimento::");
    nasc=Z.nextInt();
    System.out.print("\n Digite o Ano atual::");
    ano=Z.nextInt();
    C=ano-nasc;
    if(C<16){
    System.out.print("\n Você tem " + C + " anos e não pode votar!");
    }
    if(C>=16){
    System.out.print("\n Você tem " + C + " anos e pode votar");
    }
    
    }
}