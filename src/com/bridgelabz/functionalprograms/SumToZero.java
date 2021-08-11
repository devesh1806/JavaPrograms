package com.bridgelabz.functionalprograms;
import java.util.*;

public class SumToZero {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of elements");
		int num = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList(num);
		for (int i = 0 ; i < num ; i++ ) {
			arr.add(sc.nextInt());
		}
		
		ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
 		for( int i = 0 ; i < num - 2 ; i++) {
			for (int j = i + 1 ; j < num - 1 ; j++) {
				for ( int k = j + 1 ; k < num ; k++) {
					if ( (arr.get(i) + arr.get(j) + arr.get(k)) == 0) {
						arr1.add(new ArrayList<Integer>(Arrays.asList(arr.get(i),arr.get(j),arr.get(k))));
					}
				}
			}
		}
 		for(int i = 0 ; i < arr1.size(); i++ ) {
 			Collections.sort(arr1.get(i));
 		}
 		
 		HashSet<ArrayList> distinctelem = new HashSet<ArrayList>();
 		for(int i = 0 ; i < arr1.size(); i++ ) {
 			distinctelem.add(arr1.get(i));
 		}
 		System.out.println("The number of distinct triplets are " + distinctelem.size() + ".");
 		ArrayList<ArrayList> list = new ArrayList<ArrayList>(distinctelem);
 		for(int i = 0 ; i < list.size(); i++ ) {
 			System.out.println(list.get(i));
 		}
	}
}
