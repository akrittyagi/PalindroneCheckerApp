import java.util.Scanner;

class UseCase4PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Palindrome Checker App (UC4) ===");

        // Read string
        System.out.print("Enter the string: ");
        String inputString = input.nextLine();

        // Convert the string into a character array
        char[] charArray = inputString.toCharArray();

        // Initialize pointer at the beginning
        int start = 0;

        // Initialize pointer at the end
        int end = charArray.length - 1;

        boolean isPalindrome = true;

        // Continue comparison until indices cross
        while (start < end) {

            if (charArray[start] != charArray[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        input.close();
    }
}