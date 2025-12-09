/*
 * PROBLEM 8: Recursive linear search
 * 
 * Question in simple words:
 * You are given an array and a target number. You need to check if the target exists in the array.
 * For example: If array = {4, 2, 8, 1} and target = 8
 * Result = true (because 8 is in the array)
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Check if the current element matches the target
 * - If yes, return true
 * - If no, search in the rest of the array (recursively)
 * - If we reach the end without finding it, return false
 */

#include <iostream>
using namespace std;

bool search(int arr[], int target, int idx, int size) 
{
    if (idx == size) return false;  // Base case: reached end, not found
    if (arr[idx] == target) return true;  // Found the target
    return search(arr, target, idx + 1, size);  // Search in rest of array
}

int main() 
{
    int arr[] = {4, 2, 8, 1};
    int size = 4;
    cout << (search(arr, 8, 0, size) ? "true" : "false") << endl;  // Output: true
    return 0;
}
