package com.bridgelabz.functionalprograms;
import java.util.*;

public class Quadratic {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three coefficients of quadratic equation:");
		System.out.println("Enter a(coefficient of x*x): ");
		int a = sc.nextInt(); 
		System.out.println("Enter b(coefficient of x): ");
		int b = sc.nextInt();
		System.out.println("Enter c(constant): ");
		int c = sc.nextInt();
		
		//condition for roots exist or not
		int delta = b*b - 4*a*c;
		if( delta < 0 ) System.out.println("Roots are Imaginary");
		else if ( delta == 0 ) {
			int root = (-1*(b))/(2*a);
			System.out.println("The root for " + a + "x*x + " + b + "x + " + c + " is " + root);
		}
		else {
			 int root1 = (int)((-1.0*(b)+Math.sqrt(delta))/(2*a));
			 int root2 = (int)((-1.0*(b)-Math.sqrt(delta))/(2*a));
			 System.out.println("The roots for " + a + "x*x + " + b + "x + " + c + " are " + root1 + " and " + root2);
		}
	}
}
