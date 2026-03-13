/**
 * ================================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * ================================================================
 * Use Case 12 : Strategy Pattern for Palindrome Algorithms
 * Description:
 * This program demonstrates different palindrome algorithms
 * using the Strategy Design Pattern.
 * The application:
 * 1. Defines a common interface
 * 2. Implements a concrete strategy
 * 3. Executes the selected algorithm
 * @author Sathwik-Vurimi
 * @version 12.0
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}

/**
 * ================================================================
 * INTERFACE – PalindromeStrategy
 * ================================================================
 * Defines the contract for palindrome checking algorithms.
 */
interface PalindromeStrategy {

    boolean check(String input);
}


/**
 * ================================================================
 * CLASS – StackStrategy
 * ================================================================
 * Implements palindrome validation using Stack.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters to stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters
        for (char c : input.toCharArray()) {

            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}