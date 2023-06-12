package main.java.tutorial;

import java.util.Arrays;

public class Tutorial3b {

	public static void main(String[] args) {
		int[] array = {25, 14, 56, 15, 36};
		int elementToRemove = 25;
		
		System.out.println("Original array: " + Arrays.toString(array));
		
		// Find the index of the element to remove
		int index = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == elementToRemove) {
				index = i;
				break;
			}
		}
		
		// Remove the element if found
		if (index != -1) {
			for (int i = index; i < array.length - 1; i++) {
				array[i] = array[i + 1];
			}
			array = Arrays.copyOf(array, array.length - 1);
			System.out.println("Array after removing " + elementToRemove + ": " + Arrays.toString(array));
		} else {
			System.out.println("Element " + elementToRemove + " not found in the array"); 
		}
	}

}
