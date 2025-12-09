/*
 * PROBLEM 9: Check if array is sorted
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to check if the numbers are in increasing order.
 * For example: If array = {1, 2, 3, 9, 18}
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

#include <iostream>
using namespace std;

bool isSorted(int arr[], int idx, int size) 
{
    if (idx == size - 1) return true;  // Base case: reached last element, sorted
    if (arr[idx] > arr[idx + 1]) return false;  // Found unsorted pair
    return isSorted(arr, idx + 1, size);  // Check rest of array
}

int main() 
{
    int arr[] = {1, 2, 3, 9, 18};
    int size = 5;
    cout << (isSorted(arr, 0, size) ? "true" : "false") << endl;  // Output: true
    return 0;
}
