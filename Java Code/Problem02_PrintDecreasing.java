/*
 * PROBLEM 2: Print numbers from N to 1
 * 
 * Question in simple words:
 * You are given a number N. You need to print all numbers from N down to 1.
 * For example: If N = 5, print: 5 4 3 2 1
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - We print the current number first
 * - Then we call the function with a smaller number (n-1)
 * - This way, larger numbers get printed first
 */

public class Problem02_PrintDecreasing {
    static void printDecreasing(int n) {
        if (n == 0)
            return; // Base case: stop when we reach 0
        System.out.print(n + " "); // First print n
        printDecreasing(n - 1); // Then print all numbers after n
    }

    public static void main(String[] args) {
        printDecreasing(5); // Output: 5 4 3 2 1
    }
}
