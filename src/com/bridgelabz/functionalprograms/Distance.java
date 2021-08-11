package com.bridgelabz.functionalprograms;
import java.util.*;

public class Distance {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers to calculate Euclidean distance");
		System.out.println("Enter x: ");
		int x = sc.nextInt(); //x integer
		System.out.println("Enter y: ");
		int y = sc.nextInt(); //y integer
		
		//Condition for Euclidean distance is below
		double euclidean = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		//Printing euclidean distance
		System.out.println("The Euclidean Distance from point (" + x + "," + y + ") to origin (0,0) is " + String.format("%.02f", euclidean) + " .");
	}
}
