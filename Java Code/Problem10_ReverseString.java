/*
 * PROBLEM 10: Reverse string
 * 
 * Question in simple words:
 * You are given a string. You need to reverse it (write it backwards).
 * For example: If string = "hello"
 * Result = "olleh"
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Take the first character
 * - Reverse the rest of the string (recursively)
 * - Put the first character at the end
 * - Example: "hello" → reverse("ello") + "h" → "olle" + "h" → "olleh"
 */

public class Problem10_ReverseString {
    static String reverse(String s) {
        if (s.length() == 0)
            return ""; // Base case: empty string
        return reverse(s.substring(1)) + s.charAt(0); // Reverse rest + first char
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // Output: olleh
    }
}
