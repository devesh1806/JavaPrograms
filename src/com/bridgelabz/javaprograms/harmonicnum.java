package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class harmonicnum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of N for calculating Nth harmonic value: ");
		int N = sc.nextInt();  //N varibale for calculating Nth value

		if ( N == 0 ) {
			System.out.println("Enter valid value of N which should be greater than 0 : ");
			N = sc.nextInt();
		}

		double harmonicval = 1.0; //1st element value i.e. H1

		//loop for value from H2...HN
		for ( int i = 2 ; i <= N ; i++ ) {
			harmonicval += 1.0/i ;
		}

		//this below statement will print nth harmonic value with 2 decimal precision.
		System.out.println("The Nth Harmonic value for N terms is " + String.format("%.02f",harmonicval) + ".");
	}
}