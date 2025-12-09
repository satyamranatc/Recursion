"""
PROBLEM 9: Check if array is sorted

Question in simple words:
You are given an array of numbers. You need to check if the numbers are in increasing order.
For example: If array = [1, 2, 3, 9, 18]
Result = True (because each number is greater than or equal to the previous one)

The catch: You must use recursion instead of loops.

How it works:
- Check if current element is less than or equal to next element
- If not, array is not sorted, return False
- If yes, check the rest of the array (recursively)
- If we reach the end, array is sorted, return True
"""

def is_sorted(arr, idx=0):
    if idx == len(arr) - 1:
        return True  # Base case: reached last element, sorted
    if arr[idx] > arr[idx + 1]:
        return False  # Found unsorted pair
    return is_sorted(arr, idx + 1)  # Check rest of array

# Main execution
if __name__ == "__main__":
    arr = [1, 2, 3, 9, 18]
    print(is_sorted(arr))  # Output: True
