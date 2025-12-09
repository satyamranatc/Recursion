/*
 * PROBLEM 4: Count digits
 * 
 * Question in simple words:
 * You are given a number. You need to count how many digits it has.
 * For example: If number = 2501
 * Count = 4 (because there are 4 digits)
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Remove one digit by dividing by 10
 * - Add 1 to the count of remaining digits
 * - Keep doing this until no digits are left
 */

#include <iostream>
using namespace std;

int countDigits(int n) 
{
    if (n == 0) return 0;  // Base case: no digits left, count is 0
    return 1 + countDigits(n / 10);  // Count this digit + count of rest
}

int main() 
{
    cout << countDigits(2501) << endl;  // Output: 4
    return 0;
}
