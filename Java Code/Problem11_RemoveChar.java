/*
 * PROBLEM 11: Remove all occurrences of a character
 * 
 * Question in simple words:
 * You are given a string and a character. You need to remove all occurrences of that character.
 * For example: If string = "aabbcc" and character = 'b'
 * Result = "aacc" (all 'b's removed)
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Look at the first character
 * - Remove the target character from rest of string (recursively)
 * - If first character matches target, skip it
 * - If first character doesn't match, keep it
 */

public class Problem11_RemoveChar {
    static String removeChar(String s, char ch) {
        if (s.length() == 0)
            return ""; // Base case: empty string
        char first = s.charAt(0);
        String small = removeChar(s.substring(1), ch); // Process rest of string

        if (first == ch)
            return small; // Skip this character
        return first + small; // Keep this character
    }

    public static void main(String[] args) {
        System.out.println(removeChar("aabbcc", 'b')); // Output: aacc
    }
}
