/**
 * ================================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * ================================================================
 * Use Case 13 : Performance Comparison
 * Description:
 * This program measures the execution time taken to check
 * whether a string is a palindrome.
 * Steps:
 * 1. Record start time
 * 2. Execute palindrome algorithm
 * 3. Record end time
 * 4. Calculate execution time
 * This demonstrates basic benchmarking of algorithms.
 * @author Sathwik-Vurimi
 * @version 13.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Record start time
        long startTime = System.nanoTime();

        // Palindrome checking logic
        boolean result = checkPalindrome(input);

        // Record end time
        long endTime = System.nanoTime();

        // Calculate execution time
        long executionTime = endTime - startTime;

        // Print results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }

    /**
     * Method to check palindrome using two-pointer technique
     */
    public static boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}