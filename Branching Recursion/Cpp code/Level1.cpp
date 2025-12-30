#include <iostream>
using namespace std;

// 1. Print n two times using recursion (Pre and Post area)
void printTwoTimes(int n) {
  if (n == 0)
    return;
  cout << n << " ";
  printTwoTimes(n - 1);
  cout << n << " ";
}

// 2. Print n then call the function twice with n-1
void printBranching(int n) {
  if (n == 0)
    return;
  cout << n << " ";
  printBranching(n - 1);
  printBranching(n - 1);
}

// 3. Count how many times a function is called (for branching logic)
int countCalls(int n) {
  if (n == 0)
    return 1; // Base case is also a call
  return 1 + countCalls(n - 1) + countCalls(n - 1);
}

int main() {
  int n = 3;

  cout << "1. Print n two times (Eulerian Path style): ";
  printTwoTimes(n);
  cout << endl;

  cout << "2. Branching Recursion (n=" << n << "): ";
  printBranching(n);
  cout << endl;

  int m = 2;
  cout << "3. Total function calls for n=" << m << ": " << countCalls(m)
       << endl;

  return 0;
}
