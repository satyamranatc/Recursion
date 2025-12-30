/*
 * PROBLEM 14: Maximum using divide and conquer
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the largest number.
 * For example: If array = {4, 8, 1, 9, 3}
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

#include <iostream>
#include <algorithm>
using namespace std;

int maxDivide(int arr[], int start, int end) 
{
    if (start == end) return arr[start];  // Base case: only one element

    int mid = (start + end) / 2;
    int left = maxDivide(arr, start, mid);  // Max in left half
    int right = maxDivide(arr, mid + 1, end);  // Max in right half

    return max(left, right);  // Return bigger of the two
}

int main() 
{
    int arr[] = {4, 8, 1, 9, 3};
    int size = 5;
    cout << maxDivide(arr, 0, size - 1) << endl;  // Output: 9
    return 0;
}
