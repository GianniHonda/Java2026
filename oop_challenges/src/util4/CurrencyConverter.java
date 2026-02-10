package util4;

public class CurrencyConverter {

	public static double price;
	public static double quantity;
	
	public static double converter() {
		return price * quantity;
	}
	
	public static double iof() {
		return converter() * 6 / 100;
	}
	
	public static double total() {
		return converter() + iof();
	}
	
	public String toString() {
		return "Amount to be paid in reais = "
				+ String.format("%.2f%n", total());
	}
}
