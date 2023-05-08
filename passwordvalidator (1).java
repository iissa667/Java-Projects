// Issa
// The 2021 Triad Programming Contest Problems
// Password Validator

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        
        //Try-catch block that catches the FileNotFoundException if the file password.txt not found
        try {
            Scanner fileScanner = new Scanner(new File("password.txt"));
            int numPasswords = Integer.parseInt(fileScanner.nextLine().trim());

            for (int i = 0; i < numPasswords; i++) {
                String password = fileScanner.nextLine().trim();
                boolean isValid = validatePassword(password);
                System.out.println(isValid ? "YES " + password : "NO " + password);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: File not found");
        }
    }

    public static boolean validatePassword(String password) {
        
        // Length of password between 8 and 32
        if (password.length() < 8 || password.length() > 32) { 
            return false;
        }
        
        // Check if first character of the password is a digit
        if (Character.isDigit(password.charAt(0))) {
            return false;
        }
        // Keep track of whether the password contains 
        // at least one lowercase letter, one uppercase letter
        // one digit, and one special character.
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSymbol = false;
        
        // List of symbol special character to check for
        String symbols = "~!@#$%^&*";

        // For Loop to check if password has a Character
        // lowerCase, upperCase, a digit and a symbol
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && symbols.indexOf(c) == -1) {
                return false;
            }

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            } else if (symbols.indexOf(c) != -1) {
                hasSymbol = true;
            }
        }

        return hasLowerCase && hasUpperCase && hasNumber && hasSymbol;
    }
}
