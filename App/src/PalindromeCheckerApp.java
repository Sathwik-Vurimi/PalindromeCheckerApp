/**
 * ================================================================
 * MAIN CLASS – UseCase9RecursivePalindrome
 * ================================================================
 * Use Case 9 : Recursive Palindrome Checker
 * Description:
 * This program checks whether a string is a palindrome
 * using recursion.
 * Characters are compared from the outer positions
 * and move inward using recursive calls.
 * Recursion stops when:
 * 1. All characters are matched (start >= end)
 * 2. A mismatch is found
 * This demonstrates divide-and-conquer logic using recursion.
 * @author Sathwik-Vurimi
 * @version 9.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        String input = "madam";

        boolean result = checkString(input, 0, input.length() - 1);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean checkString(String s, int start, int end) {

        // Base condition: all characters checked
        if (start >= end) {
            return true;
        }

        // If characters mismatch
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call moving towards the center
        return checkString(s, start + 1, end - 1);
    }
}