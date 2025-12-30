/*
 * PROBLEM 7: Sum of array
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to add all numbers together.
 * For example: If array = {5, 3, 7, 2}
 * Sum = 5 + 3 + 7 + 2 = 17
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Take the first element
 * - Add it to the sum of remaining elements (recursively)
 * - Keep doing this until no elements are left
 */

public class Problem07_SumOfArray {
    static int sumArray(int[] arr, int idx) {
        if (idx == arr.length)
            return 0; // Base case: no elements left, sum is 0
        return arr[idx] + sumArray(arr, idx + 1); // Current element + sum of rest
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 2 };
        System.out.println(sumArray(arr, 0)); // Output: 17
    }
}
