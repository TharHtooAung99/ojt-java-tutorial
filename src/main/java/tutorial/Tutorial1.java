package main.java.tutorial;

public class Tutorial1 {

	public static void main(String[] args) {
		int maxNumber = 7;
		// Print the upper half of the pattern
		for (int i = 1; i <= maxNumber; i++) {
			// Print spaces from the left
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}	
			// Print numbers in ascending order
			for (int k = i; k <= maxNumber; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		
		// Print the lower half of the pattern
		for (int i = maxNumber - 1; i >= 1; i--) {
			// Print spaces from the left
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			// Print numbers in ascending order
			for (int k = i; k <= maxNumber; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
