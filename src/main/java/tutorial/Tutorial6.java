package main.java.tutorial;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tutorial6 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Enter your password: ");
    	String password = scanner.nextLine();
    	
        if (isStrongPassword(password)) {
            System.out.println("The password is strong.");
        } else {
            System.out.println("The password is not strong.");
        }
    }

    public static boolean isStrongPassword(String password) {
        // Regex pattern for password strength
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";

        // Create a Pattern object
        Pattern regex = Pattern.compile(pattern);

        // Create a Matcher object
        Matcher matcher = regex.matcher(password);

        // Return true if the password matches the pattern, otherwise false
        return matcher.matches();
    }
}

