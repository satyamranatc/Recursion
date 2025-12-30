def print_two_times(n):
    if n == 0:
        return
    print(n, end=" ")
    print_two_times(n - 1)
    print(n, end=" ")

def print_branching(n):
    if n == 0:
        return
    print(n, end=" ")
    print_branching(n - 1)
    print_branching(n - 1)

def count_calls(n):
    if n == 0:
        return 1
    return 1 + count_calls(n - 1) + count_calls(n - 1)

if __name__ == "__main__":
    n = 3
    
    print("1. Print n two times:", end=" ")
    print_two_times(n)
    print()

    print(f"2. Branching Recursion (n={n}):", end=" ")
    print_branching(n)
    print()

    m = 2
    print(f"3. Total function calls for n={m}: {count_calls(m)}")
