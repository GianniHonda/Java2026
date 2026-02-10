package application3;

import java.util.Locale;
import java.util.Scanner;

import entities3.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.n1 = sc.nextDouble();
		student.n2 = sc.nextDouble();
		student.n3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE = " + String.format("%.2f", student.finalGrade()));
		
		if (student.isApproved()) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", student.missingPoints()) + " POINTS");
		}
		
		sc.close();
	}

}
