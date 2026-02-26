import java.util.Scanner;

/**
 * MAIN CLASS - UsceCase2PalindromeCheckerApp
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Sathwik-Vurimi
 * @version 2.0
 */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    // Taking input
    System.out.print("Input text: ");
    String input = scanner.nextLine();

    boolean isPalindrome = true;

    // Loop only till half of the string length
    for (int i = 0; i < input.length() / 2; i++) {
        if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
            isPalindrome = false;
            break;
        }
    }

    // Display result
    System.out.println("Is it a Palindrome? : " + isPalindrome);

    scanner.close();

        }
    }
