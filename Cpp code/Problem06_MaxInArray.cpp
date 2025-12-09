/*
 * PROBLEM 6: Maximum in array (recursive)
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the largest number.
 * For example: If array = {4, 8, 1, 9, 3}
 * Maximum = 9
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Look at the first element
 * - Find the maximum in the rest of the array (recursively)
 * - Compare these two and return the bigger one
 */

#include <iostream>
#include <algorithm>
using namespace std;

int findMax(int arr[], int idx, int size) 
{
    if (idx == size - 1) return arr[idx];  // Base case: last element
    int maxInRest = findMax(arr, idx + 1, size);  // Find max in remaining array
    return max(arr[idx], maxInRest);  // Return bigger of current and rest
}

int main() 
{
    int arr[] = {4, 8, 1, 9, 3};
    int size = 5;
    cout << findMax(arr, 0, size) << endl;  // Output: 9
    return 0;
}
