import java.util.Locale;
import java.util.Scanner;

public class Exercise5 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int f, h;
		double v, s;
		
		f = sc.nextInt();
		h = sc.nextInt();
		v = sc.nextDouble();
		
		s = v * h;
		
		System.out.println("NUMBER = " + f);
		System.out.printf("SALARY = U$%.2f%n", s);
		
		sc.close();
}
}
