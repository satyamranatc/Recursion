/*
 * PROBLEM 1: Print numbers from 1 to N
 * 
 * Question in simple words:
 * You are given a number N. You need to print all numbers from 1 to N.
 * For example: If N = 5, print: 1 2 3 4 5
 * 
 * The catch: You must use recursion (function calling itself) instead of loops.
 * 
 * How it works:
 * - We call the function with a smaller number (n-1) first
 * - Then when the function returns, we print the current number
 * - This way, smaller numbers get printed first
 */

#include <iostream>
using namespace std;

void printIncreasing(int n) 
{
    if (n == 0) return;  // Base case: stop when we reach 0
    printIncreasing(n - 1);  // First, print all numbers before n
    cout << n << " ";  // Then print n
}

int main() 
{
    printIncreasing(5);  // Output: 1 2 3 4 5
    return 0;
}
