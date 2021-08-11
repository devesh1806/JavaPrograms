package com.bridgelabz.javaprograms;
import java.util.Scanner;

public class vowelconso {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alphabet to Vowel or Consonant:");
		char alphabet = sc.next().charAt(0); //alphabet value for vowel or consonant checking

		if ( alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U' || alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			System.out.println("The Alphabet is a Vowel.");
		}
		else System.out.println("The Alphabet is a consonant.");
	}
}