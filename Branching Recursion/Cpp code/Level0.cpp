#include <iostream>
using namespace std;

// 1. Print numbers from n to 1
void printNto1(int n) {
    if (n == 0) return;
    cout << n << " ";
    printNto1(n - 1);
}

// 2. Print numbers from 1 to n
void print1toN(int n) {
    if (n == 0) return;
    print1toN(n - 1);
    cout << n << " ";
}

// 3. Find factorial of n
int factorial(int n) {
    if (n == 0 || n == 1) return 1;
    return n * factorial(n - 1);
}

// 4. Find sum of first n numbers
int sumN(int n) {
    if (n == 0) return 0;
    return n + sumN(n - 1);
}

int main() {
    int n = 5;
    
    cout << "1. Print n to 1: ";
    printNto1(n);
    cout << endl;

    cout << "2. Print 1 to n: ";
    print1toN(n);
    cout << endl;

    cout << "3. Factorial of " << n << ": " << factorial(n) << endl;

    cout << "4. Sum of first " << n << " numbers: " << sumN(n) << endl;

    return 0;
}
