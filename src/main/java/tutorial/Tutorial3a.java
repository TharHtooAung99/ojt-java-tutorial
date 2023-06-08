package main.java.tutorial;

import java.util.Arrays;

public class Tutorial3a {
	public static void main(String[] args) {
		int[] array = {3, 4, 5, 7, 9};
		double sum = 0;
		double average = 0;
		System.out.println("Array: " + Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println("Sum: " + sum);
		average = sum / array.length;
		System.out.println("Average: " + average);
	}
}
