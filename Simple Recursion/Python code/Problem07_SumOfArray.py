"""
PROBLEM 7: Sum of array

Question in simple words:
You are given an array of numbers. You need to add all numbers together.
For example: If array = [5, 3, 7, 2]
Sum = 5 + 3 + 7 + 2 = 17

The catch: You must use recursion instead of loops.

How it works:
- Take the first element
- Add it to the sum of remaining elements (recursively)
- Keep doing this until no elements are left
"""

def sum_array(arr, idx=0):
    if idx == len(arr):
        return 0  # Base case: no elements left, sum is 0
    return arr[idx] + sum_array(arr, idx + 1)  # Current element + sum of rest

# Main execution
if __name__ == "__main__":
    arr = [5, 3, 7, 2]
    print(sum_array(arr))  # Output: 17
