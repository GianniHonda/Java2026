import java.util.Scanner;

public class Exercise2 {

	public static void main() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite  primeiro numero: ");
		int v1 = sc.nextInt();
		
		System.out.println("Digite o segudo numero: ");
		int v2 = sc.nextInt();
		
		int soma = v1 + v2;
		System.out.println("SOMA = " + soma);
		
		sc.close();
	}
}
