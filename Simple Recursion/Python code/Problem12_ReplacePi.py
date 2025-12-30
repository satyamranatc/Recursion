"""
PROBLEM 12: Replace all "pi" with "3.14"

Question in simple words:
You are given a string. Wherever you find "pi", replace it with "3.14".
For example: If string = "xpixpipi"
Result = "x3.14x3.143.14"

The catch: You must use recursion instead of loops.

How it works:
- Check if string starts with "pi"
- If yes, replace it with "3.14" and process rest of string (recursively)
- If no, keep the first character and process rest of string (recursively)
"""

def replace_pi(s):
    if len(s) <= 1:
        return s  # Base case: string too short to contain "pi"

    if s.startswith("pi"):
        return "3.14" + replace_pi(s[2:])  # Replace "pi" and process rest
    else:
        return s[0] + replace_pi(s[1:])  # Keep first char and process rest

# Main execution
if __name__ == "__main__":
    print(replace_pi("xpixpipi"))  # Output: x3.14x3.143.14
