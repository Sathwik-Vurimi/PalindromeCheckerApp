/**
 * ================================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * ================================================================
 * Use Case 11 : Object-Oriented Palindrome Service
 * Description:
 * This program demonstrates palindrome validation using
 * object-oriented design.
 * The palindrome logic is encapsulated inside a
 * separate service class called PalindromeService.
 * This demonstrates:
 * 1. Reusability
 * 2. Modularity
 * 3. Separation of concerns
 * @author Sathwik-Vurimi
 * @version 11.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        String input = "racecar";

        // Create object of service class
        PalindromeService service = new PalindromeService();

        // Call palindrome checking method
        boolean result = service.checkPalindrome(input);

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}
/**
 * Service class that contains palindrome logic
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome
     *
     * @param input Input string
     * @return true if palindrome, otherwise false
     */
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
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