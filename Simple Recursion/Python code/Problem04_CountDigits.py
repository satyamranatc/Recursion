"""
PROBLEM 4: Count digits

Question in simple words:
You are given a number. You need to count how many digits it has.
For example: If number = 2501
Count = 4 (because there are 4 digits)

The catch: You must use recursion instead of loops.

How it works:
- Remove one digit by dividing by 10
- Add 1 to the count of remaining digits
- Keep doing this until no digits are left
"""

def count_digits(n):
    if n == 0:
        return 0  # Base case: no digits left, count is 0
    return 1 + count_digits(n // 10)  # Count this digit + count of rest

# Main execution
if __name__ == "__main__":
    print(count_digits(2501))  # Output: 4
