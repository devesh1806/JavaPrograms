package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class swapnum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers you want to swap: ");
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt(); //First Number
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt(); //Second Number

		int temp ; //Temporary variable initiated

		//logic for swapping of numbers
		temp = num1;
		num1 = num2 ;
		num2 = temp ;

		System.out.println("After Swapping: ");
		System.out.println("First number is " + num1 + " and Second number is " + num2 + ".");
	}
}