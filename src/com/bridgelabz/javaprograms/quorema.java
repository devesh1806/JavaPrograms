package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class quorema {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values to find quptient and remainder of numerator/denominator");
		System.out.println("Enter numerator: ");
		int numerator = sc.nextInt(); //numerator value
		System.out.println("Enter denominator: ");
		int denominator = sc.nextInt(); //denominator value

		int quotient = numerator/denominator ; //calculating quotient using /.
		int remainder = numerator%denominator ; //calculating remainder using %.

		System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + ".");
	}
}