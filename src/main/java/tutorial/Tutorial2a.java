package main.java.tutorial;

import java.util.Scanner;

public class Tutorial2a {
	public static void main(String[] args) {
		String output = "Expected Output";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input number: ");
		int number = scanner.nextInt();
		if (number > 0) {
			System.out.println(output + ": Number is positive");
		} else if (number < 0) {
			System.out.println(output + ": Number is negative");
		} else {
			System.out.print(output + ": Number is zero");
		}
	}
}
