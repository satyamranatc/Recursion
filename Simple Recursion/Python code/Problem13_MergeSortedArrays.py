"""
PROBLEM 13: Merge two sorted arrays recursively

Question in simple words:
You are given two arrays that are already sorted. You need to combine them into one sorted array.
For example: If A = [1, 4, 6] and B = [2, 3, 5]
Result = [1, 2, 3, 4, 5, 6]

The catch: You must use recursion instead of loops.

How it works:
- Compare the first elements of both arrays
- Take the smaller one
- Merge the rest of the arrays (recursively)
- If one array is empty, take all elements from the other array
"""

def merge(A, i, B, j):
    if i == len(A) and j == len(B):
        return []  # Both arrays exhausted

    if i == len(A):
        # A is exhausted, take from B
        return [B[j]] + merge(A, i, B, j + 1)

    if j == len(B):
        # B is exhausted, take from A
        return [A[i]] + merge(A, i + 1, B, j)

    if A[i] < B[j]:
        # A[i] is smaller, take it
        return [A[i]] + merge(A, i + 1, B, j)
    else:
        # B[j] is smaller, take it
        return [B[j]] + merge(A, i, B, j + 1)

# Main execution
if __name__ == "__main__":
    A = [1, 4, 6]
    B = [2, 3, 5]
    merged = merge(A, 0, B, 0)
    print(" ".join(map(str, merged)))  # Output: 1 2 3 4 5 6
