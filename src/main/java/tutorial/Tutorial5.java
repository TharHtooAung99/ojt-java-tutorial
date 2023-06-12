package main.java.tutorial;
import java.util.Scanner;
import java.util.Random;

public class Tutorial5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		String[] choices = {"Rock", "Paper", "Scissors"};
		
		System.out.println("Welcome to Rock-Paper-Scissors game!");
		System.out.println("Enter your choices=> 0 for Rock, 1 for Paper ,and 2 for Scissors:");
		int userChoice = scanner.nextInt();
		
		int computerChoice = random.nextInt(3);
		
		System.out.println("Your choice: " + choices[userChoice]);
		System.out.println("Computer choice: " + choices[computerChoice]);
		
		if (userChoice == computerChoice) {
			System.out.println("It's a tie!");
		} else if ((userChoice == 0 && computerChoice == 1) ||
					(userChoice == 1 && computerChoice == 0) ||
					(userChoice == 2 && computerChoice == 1)) {
			System.out.println("You win!");
		} else {
			System.out.println("Computer wins!");
		}
		scanner.close();
	}
}


