import java.util.Scanner;

class UC3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC3) ===");

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String reversed = "";

        // Iterate from the last character to the first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Compare original and reversed string
        if (str.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        input.close();
    }
}
