/*
 * PROBLEM 9: Check if array is sorted
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to check if the numbers are in increasing order.
 * For example: If array = [1, 2, 3, 9, 18]
 * Result = true (because each number is greater than or equal to the previous one)
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Check if current element is less than or equal to next element
 * - If not, array is not sorted, return false
 * - If yes, check the rest of the array (recursively)
 * - If we reach the end, array is sorted, return true
 */

function isSorted(arr, idx = 0) {
    if (idx === arr.length - 1) return true;  // Base case: reached last element, sorted
    if (arr[idx] > arr[idx + 1]) return false;  // Found unsorted pair
    return isSorted(arr, idx + 1);  // Check rest of array
}

// Main execution
const arr = [1, 2, 3, 9, 18];
console.log(isSorted(arr));  // Output: true
