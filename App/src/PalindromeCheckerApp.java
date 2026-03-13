/**
 * ================================================================
 * MAIN CLASS – UseCase10PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 10 : Normalized Palindrome Validation
 *
 * Description:
 * This program checks whether a sentence is a palindrome
 * after preprocessing the string.
 *
 * Normalization steps:
 * 1. Remove spaces and special characters
 * 2. Convert all letters to lowercase
 *
 * This ensures the palindrome check depends only on
 * characters and not formatting.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Sathwik-Vurimi
 * @version 10.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original input string
        String input = "A man a plan a canal Panama";

        // Normalize the string
        // Remove non-alphabet characters and convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        boolean isPalindrome = true;

        // Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {

            if (normalized.charAt(i) !=
                    normalized.charAt(normalized.length() - 1 - i)) {

                isPalindrome = false;
                break;
            }
        }

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}