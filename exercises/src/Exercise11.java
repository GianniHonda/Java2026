import java.util.Locale;
import java.util.Scanner;

public class Exercise11 {

public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int HI = sc.nextInt();
		int HF = sc.nextInt();
		int duracao;
		
		if (HF > HI) {
			duracao = HF - HI;
		} else {
			duracao = 24 - HI + HF;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORAS(S)");
		
		sc.close();
}
}
