/*
 * PROBLEM 11: Remove all occurrences of a character
 * 
 * Question in simple words:
 * You are given a string and a character. You need to remove all occurrences of that character.
 * For example: If string = "aabbcc" and character = 'b'
 * Result = "aacc" (all 'b's removed)
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Look at the first character
 * - Remove the target character from rest of string (recursively)
 * - If first character matches target, skip it
 * - If first character doesn't match, keep it
 */

#include <iostream>
#include <string>
using namespace std;

string removeChar(string s, char ch) 
{
    if (s.length() == 0) return "";  // Base case: empty string
    char first = s[0];
    string small = removeChar(s.substr(1), ch);  // Process rest of string

    if (first == ch) return small;  // Skip this character
    return first + small;  // Keep this character
}

int main() 
{
    cout << removeChar("aabbcc", 'b') << endl;  // Output: aacc
    return 0;
}
