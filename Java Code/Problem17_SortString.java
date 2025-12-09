/*
 * PROBLEM 17: Sort a string by dividing into halves (mini merge sort)
 * 
 * Question in simple words:
 * You are given a string with characters in random order. You need to sort them alphabetically.
 * For example: If string = "dbca"
 * Result = "abcd"
 * 
 * The catch: You must use divide and conquer (like merge sort).
 * 
 * How it works:
 * - Split the string into two halves
 * - Sort left half (recursively)
 * - Sort right half (recursively)
 * - Merge the two sorted halves together
 * - This is exactly like merge sort but with characters instead of numbers
 */

public class Problem17_SortString {
    static String sortString(String s) {
        if (s.length() <= 1)
            return s; // Base case: single character is already sorted

        int mid = s.length() / 2;

        String left = sortString(s.substring(0, mid)); // Sort left half
        String right = sortString(s.substring(mid)); // Sort right half

        return merge(left, right); // Merge sorted halves
    }

    static String merge(String a, String b) {
        if (a.length() == 0)
            return b; // If A is empty, return B
        if (b.length() == 0)
            return a; // If B is empty, return A

        if (a.charAt(0) < b.charAt(0)) {
            // A's character is smaller, take it
            return a.charAt(0) + merge(a.substring(1), b);
        } else {
            // B's character is smaller, take it
            return b.charAt(0) + merge(a, b.substring(1));
        }
    }

    public static void main(String[] args) {
        System.out.println(sortString("dbca")); // Output: abcd
    }
}
