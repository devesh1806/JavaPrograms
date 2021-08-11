package com.bridgelabz.functionalprograms;
import java.util.*;

public class Windchill {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values to calculate Wind Chill");
		System.out.println("Enter Temperature in fahrenheit which should be less than equal to 50.");
		int temp = sc.nextInt(); //variable for temperature
		System.out.println("Enter Wind speed which is greater than 3 or less than equal to 120.");
		int windsp = sc.nextInt(); //variable for wind speed
		
		double effectivetemp = 35.74 + 0.6215*temp + ( 0.4275*temp - 35.75 )*Math.pow(windsp,0.16);
		
		//printing effective temperature upto 4 decimal precision
		System.out.println("The Effective Temperature is " + String.format("%.04f",effectivetemp));
	}
}
