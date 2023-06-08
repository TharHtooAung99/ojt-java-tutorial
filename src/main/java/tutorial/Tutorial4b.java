package main.java.tutorial;

import java.util.ArrayList;

public class Tutorial4b {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Red");
		arrayList.add("Green");
		arrayList.add("Black");
		arrayList.add("White");
		arrayList.add("Pink");
		
		System.out.println("Arraylist before swapping: " + arrayList);
		
		int index1 = 0; // index of first element to swap
		int index2 = 2; // index of second element to swap
		
		// Swap element using temporary variable
		String temp = arrayList.get(0); 
		arrayList.set(index1, arrayList.get(index2));
		arrayList.set(index2, temp);
		
		System.out.println("Arraylist after swapping: " + arrayList);
	}
}
