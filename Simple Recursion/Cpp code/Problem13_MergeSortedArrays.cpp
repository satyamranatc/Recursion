/*
 * PROBLEM 13: Merge two sorted arrays recursively
 * 
 * Question in simple words:
 * You are given two arrays that are already sorted. You need to combine them into one sorted array.
 * For example: If A = {1, 4, 6} and B = {2, 3, 5}
 * Result = {1, 2, 3, 4, 5, 6}
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Compare the first elements of both arrays
 * - Take the smaller one
 * - Merge the rest of the arrays (recursively)
 * - If one array is empty, take all elements from the other array
 */

#include <iostream>
#include <vector>
using namespace std;

vector<int> merge(int A[], int i, int sizeA, int B[], int j, int sizeB) 
{
    if (i == sizeA && j == sizeB) 
    {
        return vector<int>();  // Both arrays exhausted
    }

    if (i == sizeA) 
    {
        // A is exhausted, take from B
        vector<int> rest = merge(A, i, sizeA, B, j + 1, sizeB);
        rest.insert(rest.begin(), B[j]);
        return rest;
    }

    if (j == sizeB) 
    {
        // B is exhausted, take from A
        vector<int> rest = merge(A, i + 1, sizeA, B, j, sizeB);
        rest.insert(rest.begin(), A[i]);
        return rest;
    }

    if (A[i] < B[j]) 
    {
        // A[i] is smaller, take it
        vector<int> rest = merge(A, i + 1, sizeA, B, j, sizeB);
        rest.insert(rest.begin(), A[i]);
        return rest;
    } 
    else 
    {
        // B[j] is smaller, take it
        vector<int> rest = merge(A, i, sizeA, B, j + 1, sizeB);
        rest.insert(rest.begin(), B[j]);
        return rest;
    }
}

int main() 
{
    int A[] = {1, 4, 6};
    int B[] = {2, 3, 5};
    vector<int> merged = merge(A, 0, 3, B, 0, 3);

    for (int x : merged) cout << x << " ";  // Output: 1 2 3 4 5 6
    cout << endl;
    return 0;
}
