/*
 * PROBLEM 17: Sort a string by dividing into halves (mini merge sort)
 * 
 * Question in simple words:
 * You are given a string with characters in random order. You need to sort them alphabetically.
 * For example: If string = "dbca"
 * Result = "abcd"
 * 
 * The catch: You must use divide and conquer (like merge sort).
 * 
 * How it works:
 * - Split the string into two halves
 * - Sort left half (recursively)
 * - Sort right half (recursively)
 * - Merge the two sorted halves together
 * - This is exactly like merge sort but with characters instead of numbers
 */

function merge(a, b) {
    if (a.length === 0) return b;  // If A is empty, return B
    if (b.length === 0) return a;  // If B is empty, return A

    if (a[0] < b[0]) {
        // A's character is smaller, take it
        return a[0] + merge(a.substring(1), b);
    }
    else {
        // B's character is smaller, take it
        return b[0] + merge(a, b.substring(1));
    }
}

function sortString(s) {
    if (s.length <= 1) return s;  // Base case: single character is already sorted

    const mid = Math.floor(s.length / 2);

    const left = sortString(s.substring(0, mid));  // Sort left half
    const right = sortString(s.substring(mid));  // Sort right half

    return merge(left, right);  // Merge sorted halves
}

// Main execution
console.log(sortString("dbca"));  // Output: abcd
