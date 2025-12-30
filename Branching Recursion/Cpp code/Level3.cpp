#include <iostream>
#include <string>
#include <vector>
using namespace std;

// 1. Fibonacci number using recursion
int fib(int n) {
  if (n <= 1)
    return n;
  return fib(n - 1) + fib(n - 2);
}

// fib(4)
// ├── fib(3)
// │   ├── fib(2)
// │   │   ├── fib(1) → 1
// │   │   └── fib(0) → 0
// │   │   └── fib(2) → 1
// │   └── fib(1) → 1
// │   └── fib(3) → 2
// │
// └── fib(2)
//     ├── fib(1) → 1
//     └── fib(0) → 0
//     └── fib(2) → 1

// fib(4) → 3


// 2. Count total function calls in Fibonacci for small n
int countFibCalls(int n) {
  if (n <= 1)
    return 1;
  return 1 + countFibCalls(n - 1) + countFibCalls(n - 2);
}

// 3. Print all subsets of a small array [1, 2]
void subsets(vector<int> &arr, int index, vector<int> &current) {
  if (index == arr.size()) {
    cout << "{ ";
    for (int x : current)
      cout << x << " ";
    cout << "}\n";
    return;
  }

  // Include
  current.push_back(arr[index]);
  subsets(arr, index + 1, current);
  current.pop_back();

  // Exclude
  subsets(arr, index + 1, current);
}

// 4. Print all subsequences of a string "ab"
void subsequences(string s, int index, string current) {
  if (index == s.length()) {
    if (current.empty())
      cout << "{}" << endl; // representation for empty
    else
      cout << current << endl;
    return;
  }

  // Include
  subsequences(s, index + 1, current + s[index]);

  // Exclude
  subsequences(s, index + 1, current);
}

int main() {
  int n = 5;
  cout << "1. Fibonacci of " << n << ": " << fib(n) << endl;

  cout << "2. Calls to calculate Fib(" << n << "): " << countFibCalls(n)
       << endl;

  vector<int> arr = {1, 2};
  cout << "\n3. Subsets of {1, 2}:" << endl;
  vector<int> currentSubset;
  subsets(arr, 0, currentSubset);

  string s = "ab";
  cout << "\n4. Subsequences of \"ab\":" << endl;
  subsequences(s, 0, "");

  return 0;
}
