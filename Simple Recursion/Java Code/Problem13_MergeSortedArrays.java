/*
 * PROBLEM 13: Merge two sorted arrays recursively
 * 
 * Question in simple words:
 * You are given two arrays that are already sorted. You need to combine them into one sorted array.
 * For example: If A = {1, 4, 6} and B = {2, 3, 5}
 * Result = {1, 2, 3, 4, 5, 6}
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Compare the first elements of both arrays
 * - Take the smaller one
 * - Merge the rest of the arrays (recursively)
 * - If one array is empty, take all elements from the other array
 */

public class Problem13_MergeSortedArrays {
    static int[] merge(int[] A, int i, int[] B, int j) {
        if (i == A.length && j == B.length) {
            return new int[0]; // Both arrays exhausted
        }

        if (i == A.length) {
            // A is exhausted, take from B
            int[] rest = merge(A, i, B, j + 1);
            int[] result = new int[rest.length + 1];
            result[0] = B[j];
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        }

        if (j == B.length) {
            // B is exhausted, take from A
            int[] rest = merge(A, i + 1, B, j);
            int[] result = new int[rest.length + 1];
            result[0] = A[i];
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        }

        if (A[i] < B[j]) {
            // A[i] is smaller, take it
            int[] rest = merge(A, i + 1, B, j);
            int[] result = new int[rest.length + 1];
            result[0] = A[i];
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        } else {
            // B[j] is smaller, take it
            int[] rest = merge(A, i, B, j + 1);
            int[] result = new int[rest.length + 1];
            result[0] = B[j];
            System.arraycopy(rest, 0, result, 1, rest.length);
            return result;
        }
    }

    public static void main(String[] args) {
        int[] A = { 1, 4, 6 };
        int[] B = { 2, 3, 5 };
        int[] merged = merge(A, 0, B, 0);

        for (int x : merged)
            System.out.print(x + " "); // Output: 1 2 3 4 5 6
    }
}
