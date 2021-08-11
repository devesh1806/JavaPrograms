package com.bridgelabz.functionalprograms;
import java.util.Scanner;
import java.io.*;
import java.util.Locale;

public class Array2D {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		PrintWriter out1 = new PrintWriter(System.out);
		
		System.out.println("Enter 2D array components");
		System.out.println("Enter rows");
		int row = sc.nextInt();
		System.out.println("Enter column");
		int col = sc.nextInt();
		
		System.out.println("Enter what type of 2D array you want");
		System.out.println("1. Double 2. Int 3.Boolean");
		int choice = sc.nextInt();
		
		if ( choice == 1 ) {
			double[][] arr = new double[row][col];
			for(int i =0 ; i < row; i++) {
				for(int j = 0 ; j < col ; j++) {
					arr[i][j] = sc.nextDouble();
				}
			}
			
			for(int i =0 ; i < row; i++) {
				for(int j = 0 ; j < col ; j++) {
					double z = arr[i][j];
					out1.print("The arr[" + i + "][" + j + "] is " + z);
					out1.println();
				}
			}
		}
		else if ( choice == 2) {
			int[][] arr = new int[row][col];
			for(int i =0 ; i < row; i++) {
				for(int j = 0 ; j < col ; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			for(int i =0 ; i < row; i++) {
				for(int j = 0 ; j < col ; j++) {
					int z = arr[i][j];
					out1.print("The arr[" + i + "][" + j + "] is " + z);
					out1.println();
				}
			}
		}
		else {
			boolean[][] arr = new boolean[row][col];
			for(int i =0 ; i < row; i++) {
				for(int j = 0 ; j < col ; j++) {
					arr[i][j] = sc.nextBoolean();
				}
			}
			
			for(int i =0 ; i < row; i++) {
				for(int j = 0 ; j < col ; j++) {
					boolean z = arr[i][j];
					out1.print("The arr[" + i + "][" + j + "] is " + z);
					out1.println();
				}
			}
		}
		out1.close();
	}
}
