"""
PROBLEM 11: Remove all occurrences of a character

Question in simple words:
You are given a string and a character. You need to remove all occurrences of that character.
For example: If string = "aabbcc" and character = 'b'
Result = "aacc" (all 'b's removed)

The catch: You must use recursion instead of loops.

How it works:
- Look at the first character
- Remove the target character from rest of string (recursively)
- If first character matches target, skip it
- If first character doesn't match, keep it
"""

def remove_char(s, ch):
    if len(s) == 0:
        return ""  # Base case: empty string
    first = s[0]
    small = remove_char(s[1:], ch)  # Process rest of string

    if first == ch:
        return small  # Skip this character
    return first + small  # Keep this character

# Main execution
if __name__ == "__main__":
    print(remove_char("aabbcc", 'b'))  # Output: aacc
