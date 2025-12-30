"""
PROBLEM 6: Maximum in array (recursive)

Question in simple words:
You are given an array of numbers. You need to find the largest number.
For example: If array = [4, 8, 1, 9, 3]
Maximum = 9

The catch: You must use recursion instead of loops.

How it works:
- Look at the first element
- Find the maximum in the rest of the array (recursively)
- Compare these two and return the bigger one
"""

def find_max(arr, idx=0):
    if idx == len(arr) - 1:
        return arr[idx]  # Base case: last element
    max_in_rest = find_max(arr, idx + 1)  # Find max in remaining array
    return max(arr[idx], max_in_rest)  # Return bigger of current and rest

# Main execution
if __name__ == "__main__":
    arr = [4, 8, 1, 9, 3]
    print(find_max(arr))  # Output: 9
