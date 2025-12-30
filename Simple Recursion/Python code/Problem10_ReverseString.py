"""
PROBLEM 10: Reverse string

Question in simple words:
You are given a string. You need to reverse it (write it backwards).
For example: If string = "hello"
Result = "olleh"

The catch: You must use recursion instead of loops.

How it works:
- Take the first character
- Reverse the rest of the string (recursively)
- Put the first character at the end
- Example: "hello" → reverse("ello") + "h" → "olle" + "h" → "olleh"
"""

def reverse(s):
    if len(s) == 0:
        return ""  # Base case: empty string
    return reverse(s[1:]) + s[0]  # Reverse rest + first char

# Main execution
if __name__ == "__main__":
    print(reverse("hello"))  # Output: olleh
