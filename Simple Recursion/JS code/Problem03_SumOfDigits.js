/*
 * PROBLEM 3: Sum of digits
 * 
 * Question in simple words:
 * You are given a number. You need to add all its digits together.
 * For example: If number = 12345
 * Sum = 1 + 2 + 3 + 4 + 5 = 15
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Take the last digit using (n % 10)
 * - Add it to the sum of remaining digits (n / 10)
 * - Keep doing this until no digits are left
 */

function sumDigits(n) {
    if (n === 0) return 0;  // Base case: no digits left, sum is 0
    return (n % 10) + sumDigits(Math.floor(n / 10));  // Last digit + sum of rest
}

// Main execution
console.log(sumDigits(12345));  // Output: 15
