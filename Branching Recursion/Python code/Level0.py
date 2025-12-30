def print_n_to_1(n):
    if n == 0:
        return
    print(n, end=" ")
    print_n_to_1(n - 1)

def print_1_to_n(n):
    if n == 0:
        return
    print_1_to_n(n - 1)
    print(n, end=" ")

def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

def sum_n(n):
    if n == 0:
        return 0
    return n + sum_n(n - 1)

if __name__ == "__main__":
    n = 5
    
    print("1. Print n to 1:", end=" ")
    print_n_to_1(n)
    print()

    print("2. Print 1 to n:", end=" ")
    print_1_to_n(n)
    print()

    print(f"3. Factorial of {n}: {factorial(n)}")

    print(f"4. Sum of first {n} numbers: {sum_n(n)}")
