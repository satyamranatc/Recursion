"""
PROBLEM 16: Merge two sorted linked lists (recursive)

Question in simple words:
You are given two linked lists that are already sorted. You need to merge them into one sorted list.
For example: If list A = 1 → 4 → 6 and list B = 2 → 3 → 5
Result = 1 → 2 → 3 → 4 → 5 → 6

The catch: You must use recursion instead of loops.

How it works:
- Compare the first nodes of both lists
- Take the smaller one
- Attach the result of merging the rest (recursively)
- If one list is empty, return the other list
"""

class ListNode:
    def __init__(self, val):
        self.val = val
        self.next = None

def merge_lists(a, b):
    if a is None:
        return b  # If list A is empty, return B
    if b is None:
        return a  # If list B is empty, return A

    if a.val < b.val:
        # A's value is smaller, take it
        a.next = merge_lists(a.next, b)  # Merge rest of A with B
        return a
    else:
        # B's value is smaller, take it
        b.next = merge_lists(a, b.next)  # Merge A with rest of B
        return b

# Main execution
if __name__ == "__main__":
    a = ListNode(1)
    a.next = ListNode(4)
    a.next.next = ListNode(6)

    b = ListNode(2)
    b.next = ListNode(3)
    b.next.next = ListNode(5)

    result = merge_lists(a, b)

    print("Output: ", end="")
    while result is not None:
        print(result.val, end=" ")  # Output: 1 2 3 4 5 6
        result = result.next
    print()
