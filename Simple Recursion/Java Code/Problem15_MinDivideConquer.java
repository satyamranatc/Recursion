/*
 * PROBLEM 15: Minimum using divide and conquer
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the smallest number.
 * For example: If array = {4, 8, 1, 9, 3}
 * Minimum = 1
 * 
 * The catch: You must use divide and conquer approach (split array in half).
 * 
 * How it works:
 * - Split the array into two halves
 * - Find minimum in left half (recursively)
 * - Find minimum in right half (recursively)
 * - Return the smaller of the two minimums
 * - Same as maximum problem but we find the smaller value
 */

public class Problem15_MinDivideConquer {
    static int minDivide(int[] arr, int start, int end) {
        if (start == end)
            return arr[start]; // Base case: only one element

        int mid = (start + end) / 2;
        int left = minDivide(arr, start, mid); // Min in left half
        int right = minDivide(arr, mid + 1, end); // Min in right half

        return Math.min(left, right); // Return smaller of the two
    }

    public static void main(String[] args) {
        int[] arr = { 4, 8, 1, 9, 3 };
        System.out.println(minDivide(arr, 0, arr.length - 1)); // Output: 1
    }
}
