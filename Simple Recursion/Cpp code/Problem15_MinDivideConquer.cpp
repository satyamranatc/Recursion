/*
 * PROBLEM 15: Minimum using divide and conquer
 * 
 * Question in simple words:
 * You are given an array of numbers. You need to find the smallest number.
 * For example: If array = {4, 8, 1, 9, 3}
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

#include <iostream>
#include <algorithm>
using namespace std;

int minDivide(int arr[], int start, int end) 
{
    if (start == end) return arr[start];  // Base case: only one element

    int mid = (start + end) / 2;
    int left = minDivide(arr, start, mid);  // Min in left half
    int right = minDivide(arr, mid + 1, end);  // Min in right half

    return min(left, right);  // Return smaller of the two
}

int main() 
{
    int arr[] = {4, 8, 1, 9, 3};
    int size = 5;
    cout << minDivide(arr, 0, size - 1) << endl;  // Output: 1
    return 0;
}
