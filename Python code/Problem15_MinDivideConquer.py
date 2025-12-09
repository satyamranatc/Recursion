"""
PROBLEM 15: Minimum using divide and conquer

Question in simple words:
You are given an array of numbers. You need to find the smallest number.
For example: If array = [4, 8, 1, 9, 3]
Minimum = 1

The catch: You must use divide and conquer approach (split array in half).

How it works:
- Split the array into two halves
- Find minimum in left half (recursively)
- Find minimum in right half (recursively)
- Return the smaller of the two minimums
- Same as maximum problem but we find the smaller value
"""

def min_divide(arr, start, end):
    if start == end:
        return arr[start]  # Base case: only one element

    mid = (start + end) // 2
    left = min_divide(arr, start, mid)  # Min in left half
    right = min_divide(arr, mid + 1, end)  # Min in right half

    return min(left, right)  # Return smaller of the two

# Main execution
if __name__ == "__main__":
    arr = [4, 8, 1, 9, 3]
    print(min_divide(arr, 0, len(arr) - 1))  # Output: 1
