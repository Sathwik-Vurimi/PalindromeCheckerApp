/**
 * ================================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ================================================================
 * Use Case 7 : Deque Based Optimized Palindrome Checker
 * Description:
 * This program checks whether a string is a palindrome
 * using a Deque (Double Ended Queue).
 * A Deque allows insertion and removal from both ends.
 * Operations used:
 * 1. addLast()      -> insert character at end
 * 2. removeFirst()  -> remove character from front
 * 3. removeLast()   -> remove character from rear
 * If characters from front and rear match until the
 * middle is reached, the string is a palindrome.
 * @author Sathwik-Vurimi
 * @version 7.0
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character of string into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}