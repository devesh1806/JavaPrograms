package com.bridgelabz.javaprograms;
import java.util.Scanner;

import javax.swing.text.TabableView;

public class power2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N till you want table of power of 2");
		int N = sc.nextInt();  //N variable for power
		if ( N >= 31 ) {
			System.out.println("Enter valid value N value should be less than 31"); //checking that value of N less than 31 to prevent int overflow
			N = sc.nextInt();
		}

		System.out.println("The Table of power 2 is ");
		for( int po = 0 ; po <= N ; po++ ) {
			int tablelement = (int)Math.pow(2, po); //tablelement for generation of 2 power N 
			System.out.println("2 power " + po + " is " + tablelement );
		}
	}
}