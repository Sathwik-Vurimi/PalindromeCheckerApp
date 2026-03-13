import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
/**
 * ================================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * ================================================================
 * Use Case 6: Queue + Stack Based Palindrome Check
 * Description:
 This program checks whether a given string is a palindrome
 * using two data structures:
 * Queue  -> FIFO (First In First Out)
 * Stack  -> LIFO (Last In First Out)
 * Logic:
 * 1. Insert each character into both a queue and a stack.
 * 2. Remove characters from the front of the queue and the top of the stack.
 * 3. Compare them.
 * 4. If all characters match, the string is a palindrome.
 * @author Sathwik-Vurimi
 * @version 6.0
 *
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.print("Input text: ");
        String text = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}