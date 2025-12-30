#include <iostream>
#include <string>
using namespace std;

// 1. Print all possible binary strings of length n
void generateBinary(int n, string current) {
  if (n == 0) {
    cout << current << endl;
    return;
  }
  generateBinary(n - 1, current + "0");
  generateBinary(n - 1, current + "1");
}

// 2. Print all paths using L and R for n steps
void generatePaths(int n, string path) {
  if (n == 0) {
    cout << path << endl;
    return;
  }
  generatePaths(n - 1, path + "L");
  generatePaths(n - 1, path + "R");
}

// 3. Print all combinations of choosing left or right n times
void generateCombinations(int n, string combo) {
  if (n == 0) {
    cout << combo << endl;
    return;
  }
  generateCombinations(n - 1, combo + "Left ");
  generateCombinations(n - 1, combo + "Right ");
}

int main() {
  int n = 3;

  cout << "1. Binary strings of length " << n << ":" << endl;
  generateBinary(n, "");

  cout << "\n2. Paths (L/R) for " << n << " steps:" << endl;
  generatePaths(n, "");

  cout << "\n3. Combinations (Left/Right) for " << n << " choices:" << endl;
  generateCombinations(n, "");

  return 0;
}
