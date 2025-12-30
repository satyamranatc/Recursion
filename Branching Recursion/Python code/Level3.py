def fib(n):
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

def count_fib_calls(n):
    if n <= 1:
        return 1
    return 1 + count_fib_calls(n - 1) + count_fib_calls(n - 2)

def subsets(arr, index, current):
    if index == len(arr):
        print(current)
        return
    
    # Include
    current.append(arr[index])
    subsets(arr, index + 1, current)
    current.pop()
    
    # Exclude
    subsets(arr, index + 1, current)

def subsequences(s, index, current):
    if index == len(s):
        if not current:
            print("{}")
        else:
            print(current)
        return
    
    # Include
    subsequences(s, index + 1, current + s[index])
    
    # Exclude
    subsequences(s, index + 1, current)

if __name__ == "__main__":
    n = 5
    print(f"1. Fibonacci of {n}: {fib(n)}")
    
    print(f"2. Calls to calculate Fib({n}): {count_fib_calls(n)}")
    
    arr = [1, 2]
    print(f"\n3. Subsets of {arr}:")
    subsets(arr, 0, [])
    
    s = "ab"
    print(f"\n4. Subsequences of \"{s}\":")
    subsequences(s, 0, "")
