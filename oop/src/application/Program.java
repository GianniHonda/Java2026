package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Products products = new Products();
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		products.name = sc.nextLine();
		System.out.print("Price: ");
		products.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		products.quantity = sc.nextInt();
		
		System.out.println(products.name + ", " + products.price + ", " + products.quantity);
		
		sc.close();
	}

}
