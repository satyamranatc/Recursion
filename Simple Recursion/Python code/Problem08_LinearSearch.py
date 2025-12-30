"""
PROBLEM 8: Recursive linear search

Question in simple words:
You are given an array and a target number. You need to check if the target exists in the array.
For example: If array = [4, 2, 8, 1] and target = 8
Result = True (because 8 is in the array)

The catch: You must use recursion instead of loops.

How it works:
- Check if the current element matches the target
- If yes, return True
- If no, search in the rest of the array (recursively)
- If we reach the end without finding it, return False
"""

def search(arr, target, idx=0):
    if idx == len(arr):
        return False  # Base case: reached end, not found
    if arr[idx] == target:
        return True  # Found the target
    return search(arr, target, idx + 1)  # Search in rest of array

# Main execution
if __name__ == "__main__":
    arr = [4, 2, 8, 1]
    print(search(arr, 8))  # Output: True
