package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class primefactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to find prime factors of value: ");
		int value = sc.nextInt(); //value variable for prime factors

		System.out.print("The prime factors of " + value + " are ");

		//find all 2 that divide value
		while( value % 2 == 0 ) {
			System.out.print("2 ");
			value /= 2 ;
		}

		// condition for prime numbers after 2 
		for ( int i = 3 ; i <= Math.sqrt(value) ; i += 2 ) {
			while ( value % i == 0) {
				System.out.print(i + " ");
				value /= i ; 
			}
		}

		//remaining value printed, eg = 10 so 2 will be printed first and then this below conditon will print remained value.
		if ( value > 2 ) {
			System.out.print(value);
		}
		System.out.print(".");
	}
}