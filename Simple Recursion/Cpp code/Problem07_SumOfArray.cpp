/*
 * PROBLEM 7: Sum of array
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to add all numbers together.
 * For example: If array = {5, 3, 7, 2}
 * Sum = 5 + 3 + 7 + 2 = 17
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Take the first element
 * - Add it to the sum of remaining elements (recursively)
 * - Keep doing this until no elements are left
 */

#include <iostream>
using namespace std;

int sumArray(int arr[], int idx, int size) 
{
    if (idx == size) return 0;  // Base case: no elements left, sum is 0
    return arr[idx] + sumArray(arr, idx + 1, size);  // Current element + sum of rest
}

int main() 
{
    int arr[] = {5, 3, 7, 2};
    int size = 4;
    cout << sumArray(arr, 0, size) << endl;  // Output: 17
    return 0;
}
