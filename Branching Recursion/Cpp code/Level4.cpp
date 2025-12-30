#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
using namespace std;

// 1. Print all permutations of "ABC" (using "ABC" as "ab" is too small to see
// much)
void permute(string s, int l, int r) {
  if (l == r) {
    cout << s << endl;
    return;
  }
  for (int i = l; i <= r; i++) {
    swap(s[l], s[i]);
    permute(s, l + 1, r);
    swap(s[l], s[i]); // backtrack
  }
}

// 2. Print all ways to climb stairs if you can take 1 or 2 steps
void climbStairs(int n, string path) {
  if (n == 0) {
    cout << path << endl;
    return;
  }
  if (n < 0)
    return;

  climbStairs(n - 1, path + "1 ");
  climbStairs(n - 2, path + "2 ");
}

// 3. Print all paths in a 2x2 grid (Right and Down) from (0,0) to MAX
void gridPaths(int r, int c, int R, int C, string path) {
  if (r == R - 1 && c == C - 1) {
    cout << path << endl;
    return;
  }

  // Move Down
  if (r < R - 1)
    gridPaths(r + 1, c, R, C, path + "D");

  // Move Right
  if (c < C - 1)
    gridPaths(r, c + 1, R, C, path + "R");
}

int main() {
  string s = "ABC";
  cout << "1. Permutations of " << s << ":" << endl;
  permute(s, 0, s.length() - 1);

  int n = 3;
  cout << "\n2. Ways to climb " << n << " stairs:" << endl;
  climbStairs(n, "");

  int R = 2, C = 2; // 2x2 grid (indices 0 to 1)
  cout << "\n3. Paths in a " << R << "x" << C << " grid:" << endl;
  gridPaths(0, 0, R, C, "");

  return 0;
}
