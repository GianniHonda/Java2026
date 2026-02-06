import java.util.Locale;
import java.util.Scanner;

public class Exercise8 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		if (n < 0) {
			System.out.println("NEGATIVO");
		} else if (n > 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();
}
}
