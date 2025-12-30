/*
 * PROBLEM 6: Maximum in array (recursive)
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the largest number.
 * For example: If array = [4, 8, 1, 9, 3]
 * Maximum = 9
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Look at the first element
 * - Find the maximum in the rest of the array (recursively)
 * - Compare these two and return the bigger one
 */

function findMax(arr, idx = 0) {
    if (idx === arr.length - 1) return arr[idx];  // Base case: last element
    const maxInRest = findMax(arr, idx + 1);  // Find max in remaining array
    return Math.max(arr[idx], maxInRest);  // Return bigger of current and rest
}

// Main execution
const arr = [4, 8, 1, 9, 3];
console.log(findMax(arr));  // Output: 9
