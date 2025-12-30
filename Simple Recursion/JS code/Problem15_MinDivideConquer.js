/*
 * PROBLEM 15: Minimum using divide and conquer
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the smallest number.
 * For example: If array = [4, 8, 1, 9, 3]
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

function minDivide(arr, start, end) {
    if (start === end) return arr[start];  // Base case: only one element

    const mid = Math.floor((start + end) / 2);
    const left = minDivide(arr, start, mid);  // Min in left half
    const right = minDivide(arr, mid + 1, end);  // Min in right half

    return Math.min(left, right);  // Return smaller of the two
}

// Main execution
const arr = [4, 8, 1, 9, 3];
console.log(minDivide(arr, 0, arr.length - 1));  // Output: 1
