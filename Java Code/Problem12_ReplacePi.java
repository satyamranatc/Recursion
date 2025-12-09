/*
 * PROBLEM 12: Replace all "pi" with "3.14"
 * 
 * Question in simple words:
 * You are given a string. Wherever you find "pi", replace it with "3.14".
 * For example: If string = "xpixpipi"
 * Result = "x3.14x3.143.14"
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Check if string starts with "pi"
 * - If yes, replace it with "3.14" and process rest of string (recursively)
 * - If no, keep the first character and process rest of string (recursively)
 */

public class Problem12_ReplacePi {
    static String replacePi(String s) {
        if (s.length() <= 1)
            return s; // Base case: string too short to contain "pi"

        if (s.startsWith("pi")) {
            return "3.14" + replacePi(s.substring(2)); // Replace "pi" and process rest
        } else {
            return s.charAt(0) + replacePi(s.substring(1)); // Keep first char and process rest
        }
    }

    public static void main(String[] args) {
        System.out.println(replacePi("xpixpipi")); // Output: x3.14x3.143.14
    }
}
