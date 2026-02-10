package entities3;

public class Student {

	public String name;
	public double n1, n2, n3;
	
	public double finalGrade() {
		return n1 + n2 + n3;
	}
	
	public boolean isApproved() {
		return finalGrade() >= 60.0;
	}
	
	public double missingPoints() {
		if (isApproved()) {
			return 0.0;
		} else {
			return 60.0 - finalGrade();
		}
	}
}
