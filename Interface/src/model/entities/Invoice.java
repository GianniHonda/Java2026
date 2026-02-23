package model.entities;

public class Invoice {
	
	private Double baiscPayment;
	private Double tax;
	
	public Invoice() {
	}

	public Invoice(Double baiscPayment, Double tax) {
		this.baiscPayment = baiscPayment;
		this.tax = tax;
	}

	public Double getBaiscPayment() {
		return baiscPayment;
	}

	public void setBaiscPayment(Double baiscPayment) {
		this.baiscPayment = baiscPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	public Double getTotalPayment() {
		return getBaiscPayment() + getTax();
	}
}
