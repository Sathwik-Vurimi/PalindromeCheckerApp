/**
 * ================================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ================================================================
 * Use Case 8 : LinkedList Based Palindrome Checker
 * Description:
 * This program checks whether a string is a palindrome
 * using a LinkedList.
 * Characters are inserted into the LinkedList and then
 * compared from both ends using:
 * removeFirst()  -> removes element from beginning
 * removeLast()   -> removes element from end
 * If all characters match, the string is a palindrome.
 * @author Sathwik-Vurimi
 * @version 8.0
 */
import java.util.LinkedList;

public class PalindromeCheckerApp {

    /**
     * Application entry point
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character of the string into the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}