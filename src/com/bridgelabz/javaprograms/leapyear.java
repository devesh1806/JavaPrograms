package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class leapyear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year with should be 4 digit number");
		int year = sc.nextInt();  //Year variable taken from user


		//condition of leap year that either it should be divisible by 4 and 100 both or divisible by 4.
		if ( year % 400 == 0 ) {
			System.out.println(year + " is leap year.");
		}
		else if ( year % 100 == 0 ) {
			System.out.println(year + " is not a leap year.");
		}
		else {
			System.out.println(year + " is leap year.");
		}
	}
}