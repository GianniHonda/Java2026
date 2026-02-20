package application15;

import java.util.Locale;
import java.util.Scanner;

import entities15.Account;
import exceptions15.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os dados da conta");
		System.out.println("Numero: ");
		int number = sc.nextInt();
		System.out.println("Titular: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.println("Informe uma quantia para sacar: ");
		double amount = sc.nextDouble();
		
		try {
		acc.withddraw(amount);
		System.out.println("Novo saldo: " + String.format("%.2f", acc.getBalance()));
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
