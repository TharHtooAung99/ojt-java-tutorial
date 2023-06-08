package main.java.tutorial;

import java.util.Scanner;

public class Tutorial2b {
	public static void main(String[] args) {
		int largestNum = Integer.MIN_VALUE;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input 1st number: ");
		int firstNum = scanner.nextInt();
		if (firstNum >= largestNum) {
			largestNum = firstNum;
		}
		System.out.print("Input 2nd number: ");
		int secondNum = scanner.nextInt();
		if (secondNum >= largestNum) {
			largestNum = secondNum;
		}
		System.out.print("Input 3rd number: ");
		int thirdNum = scanner.nextInt();
		if (thirdNum >= largestNum) {
			largestNum = thirdNum;
		}
		System.out.println("Expected Output :");
		System.out.print("The greatest: " + largestNum);
	}
}
