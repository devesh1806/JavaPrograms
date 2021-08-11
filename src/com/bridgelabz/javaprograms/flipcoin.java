package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class flipcoin {

	private static final double randomlogic = 0.5 ;
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  //Scanner imported for input purpose
		System.out.println("Enter number of times coins flipped: ");
		int nooffliptimes = sc.nextInt(); //variable for Number of times coin to be flipped 

		int heads = 0 ; // Number of times head occurs
		int tails = 0 ; // Number of times tail occurs

		for( int ran = 0 ; ran < nooffliptimes ; ran++ ) {
			double ran_value = Math.random();
			if ( ran_value < randomlogic ) {
				heads++ ;
			}
			else tails++ ;
		}

		double headper = ((heads*1.0)/nooffliptimes)*100; //percentage of head
		double tailper = ((tails*1.0)/nooffliptimes)*100; //percentage of tail

		System.out.println("The percentage of head is " + String.valueOf(headper) + "% and percentage of tail is " + String.valueOf(tailper) +"%.");

	}
}