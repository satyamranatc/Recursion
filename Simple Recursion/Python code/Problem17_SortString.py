"""
PROBLEM 17: Sort a string by dividing into halves (mini merge sort)

Question in simple words:
You are given a string with characters in random order. You need to sort them alphabetically.
For example: If string = "dbca"
Result = "abcd"

The catch: You must use divide and conquer (like merge sort).

How it works:
- Split the string into two halves
- Sort left half (recursively)
- Sort right half (recursively)
- Merge the two sorted halves together
- This is exactly like merge sort but with characters instead of numbers
"""

def merge(a, b):
    if len(a) == 0:
        return b  # If A is empty, return B
    if len(b) == 0:
        return a  # If B is empty, return A

    if a[0] < b[0]:
        # A's character is smaller, take it
        return a[0] + merge(a[1:], b)
    else:
        # B's character is smaller, take it
        return b[0] + merge(a, b[1:])

def sort_string(s):
    if len(s) <= 1:
        return s  # Base case: single character is already sorted

    mid = len(s) // 2

    left = sort_string(s[:mid])  # Sort left half
    right = sort_string(s[mid:])  # Sort right half

    return merge(left, right)  # Merge sorted halves

# Main execution
if __name__ == "__main__":
    print(sort_string("dbca"))  # Output: abcd
