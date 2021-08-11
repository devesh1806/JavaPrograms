package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class largest3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers to find largest among them: ");
		System.out.println("Enter First number");
		int num1 = sc.nextInt(); //First Number
		System.out.println("Enter Second number");
		int num2 = sc.nextInt(); //Second Number
		System.out.println("Enter Third number");
		int num3 = sc.nextInt(); //Third Number

		//condition for largest among 3
		if ( num1 > num2 ) {
			if ( num1 > num3 ) System.out.println("The First number is Largest having value: "+ num1 );
			else System.out.println("The Third is Largest number having value: " + num3 );
		}
		else {
			if ( num2 > num3 ) System.out.println("The Second number is Largest having value: "+ num2 );
			else System.out.println("The Third is Largest number having value: " + num3 );
		}
	}
}