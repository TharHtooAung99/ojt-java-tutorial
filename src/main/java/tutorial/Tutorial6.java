package main.java.tutorial;
import java.util.Scanner;

public class Tutorial6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your password: ");
		String password = scanner.nextLine();
		
		if (isStrongPassword(password)) {
			System.out.println("Your password is strong!");
		} else {
			System.out.println("Your password is not strong!");
		}
		scanner.close();
	}
	
	private static boolean isStrongPassword(String password) {
		if (password.length() < 8) {
			return false;
		}
		
		boolean hasLowercase = false;
		boolean hasUppercase = false;
		boolean hasNumber = false;
		boolean hasSpecialChar = false;
		
		for (int i = 0; i < password.length(); i++) {
			char ch = password.charAt(i);
			
			if (Character.isLowerCase(ch)) {
				hasLowercase = true;
			} else if (Character.isUpperCase(ch)) {
				hasUppercase = true;
			} else if (Character.isDigit(ch)) {
				hasNumber = true;
			} else {
				hasSpecialChar = true;
			}
			
			if (hasLowercase && hasUppercase && hasNumber && hasSpecialChar) {
				return true;
			}
		}
		return false;
	}
}
