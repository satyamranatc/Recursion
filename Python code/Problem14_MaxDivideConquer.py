"""
PROBLEM 14: Maximum using divide and conquer

Question in simple words:
You are given an array of numbers. You need to find the largest number.
For example: If array = [4, 8, 1, 9, 3]
Maximum = 9

The catch: You must use divide and conquer approach (split array in half).

How it works:
- Split the array into two halves
- Find maximum in left half (recursively)
- Find maximum in right half (recursively)
- Return the bigger of the two maximums
- This is like a tournament where winners from each half compete
"""

def max_divide(arr, start, end):
    if start == end:
        return arr[start]  # Base case: only one element

    mid = (start + end) // 2
    left = max_divide(arr, start, mid)  # Max in left half
    right = max_divide(arr, mid + 1, end)  # Max in right half

    return max(left, right)  # Return bigger of the two

# Main execution
if __name__ == "__main__":
    arr = [4, 8, 1, 9, 3]
    print(max_divide(arr, 0, len(arr) - 1))  # Output: 9
