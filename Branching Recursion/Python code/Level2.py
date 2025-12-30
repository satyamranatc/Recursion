def generate_binary(n, current):
    if n == 0:
        print(current)
        return
    generate_binary(n - 1, current + "0")
    generate_binary(n - 1, current + "1")

def generate_paths(n, path):
    if n == 0:
        print(path)
        return
    generate_paths(n - 1, path + "L")
    generate_paths(n - 1, path + "R")

def generate_combinations(n, combo):
    if n == 0:
        print(combo)
        return
    generate_combinations(n - 1, combo + "Left ")
    generate_combinations(n - 1, combo + "Right ")

if __name__ == "__main__":
    n = 3
    
    print(f"1. Binary strings of length {n}:")
    generate_binary(n, "")
    
    print(f"\n2. Paths (L/R) for {n} steps:")
    generate_paths(n, "")
    
    print(f"\n3. Combinations (Left/Right) for {n} choices:")
    generate_combinations(n, "")
