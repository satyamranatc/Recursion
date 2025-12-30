/*
 * PROBLEM 7: Sum of array
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to add all numbers together.
 * For example: If array = [5, 3, 7, 2]
 * Sum = 5 + 3 + 7 + 2 = 17
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Take the first element
 * - Add it to the sum of remaining elements (recursively)
 * - Keep doing this until no elements are left
 */

function sumArray(arr, idx = 0) {
    if (idx === arr.length) return 0;  // Base case: no elements left, sum is 0
    return arr[idx] + sumArray(arr, idx + 1);  // Current element + sum of rest
}

// Main execution
const arr = [5, 3, 7, 2];
console.log(sumArray(arr));  // Output: 17
