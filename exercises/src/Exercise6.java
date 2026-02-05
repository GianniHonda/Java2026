import java.util.Locale;
import java.util.Scanner;

public class Exercise6 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int c1, c2, n1, n2;
		double vu1, vu2, vp;
		
		c1 = sc.nextInt();
		n1 = sc.nextInt();
		vu1 = sc.nextDouble();
		
		c2 = sc.nextInt();
		n2 = sc.nextInt();
		vu2 = sc.nextDouble();	
		
		vp = n1 * vu1 + n2 * vu2;
		
		System.out.printf("VALOR A PAGAR: R$%.2f%n", vp);
		
		sc.close();
}
}
