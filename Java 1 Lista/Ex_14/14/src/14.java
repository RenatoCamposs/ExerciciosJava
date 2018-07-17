
public class 14 {
    
    public static void main(String[] args) {
          Scanner T =  new Scanner (System.in);
        double A,B,C,D;
        System.out.println("Entre com M para masculino e F para feminino::");
        A = T.nextDouble();
        if (A==M){
        	System.out.println("Entre com a sua altura::");
        	B = T.nextDouble();
        	C = B*72,2;
        	D = C-58;
        	System.out.println("Seu peso ideal e= "+D);
        }else if(A==F){
        	System.out.println("Entre com a sua altura::");
        	B = T.nextDouble();
        	C = B*62,1;
        	D = C-44,7;
        	System.out.println("Seu peso ideal e="+D);
        }
    }
}