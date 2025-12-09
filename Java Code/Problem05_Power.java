/*
 * PROBLEM 5: Power function (x^n)
 * 
 * Question in simple words:
 * You are given two numbers: x (base) and n (exponent).
 * You need to calculate x raised to the power n.
 * For example: If x = 2 and n = 5
 * Result = 2^5 = 2 × 2 × 2 × 2 × 2 = 32
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - x^n = x × x^(n-1)
 * - Keep multiplying x with the result of smaller power
 * - Stop when power becomes 0 (anything to power 0 is 1)
 */

public class Problem05_Power {
    static int power(int x, int n) {
        if (n == 0)
            return 1; // Base case: x^0 = 1
        return x * power(x, n - 1); // x × x^(n-1)
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5)); // Output: 32
    }
}
