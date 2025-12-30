/*
 * PROBLEM 14: Maximum using divide and conquer
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the largest number.
 * For example: If array = [4, 8, 1, 9, 3]
 * Maximum = 9
 * 
 * The catch: You must use divide and conquer approach (split array in half).
 * 
 * How it works:
 * - Split the array into two halves
 * - Find maximum in left half (recursively)
 * - Find maximum in right half (recursively)
 * - Return the bigger of the two maximums
 * - This is like a tournament where winners from each half compete
 */

function maxDivide(arr, start, end) {
    if (start === end) return arr[start];  // Base case: only one element

    const mid = Math.floor((start + end) / 2);
    const left = maxDivide(arr, start, mid);  // Max in left half
    const right = maxDivide(arr, mid + 1, end);  // Max in right half

    return Math.max(left, right);  // Return bigger of the two
}

// Main execution
const arr = [4, 8, 1, 9, 3];
console.log(maxDivide(arr, 0, arr.length - 1));  // Output: 9
