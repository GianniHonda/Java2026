import java.util.Scanner;

public class Exercise18 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tipoCombustivel = sc.nextInt();
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		
		while (tipoCombustivel != 4) {
			if (tipoCombustivel == 1) {
				Alcool = Alcool +1;
			} else if (tipoCombustivel == 2) {
				Gasolina = Gasolina + 1;
			} else if (tipoCombustivel == 3) {
				Diesel = Diesel + 1;
			}
			
			tipoCombustivel = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + Alcool);
		System.out.println("Gasolina: " + Gasolina);
		System.out.println("Diesel: " + Diesel);
		
		sc.close();
}
}
