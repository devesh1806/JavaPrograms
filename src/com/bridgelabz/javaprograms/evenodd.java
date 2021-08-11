package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class evenodd {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to check even or odd:");
		int value = sc.nextInt(); //value variable for even odd calculation

		//condition to check even or odd
		if ( value % 2 == 0) System.out.println("The value is Even.");
		else System.out.println("The value is Odd.");
	}
}