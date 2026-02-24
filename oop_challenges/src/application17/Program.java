package application17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities17.Contract;
import entities17.Installment;
import services17.ContractService;
import services17.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.println("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		Contract obj = new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero deparcelas:");
		int n = sc.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService()); 
		
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}

		sc.close();
	}

}
