def permute(s, l, r):
    if l == r:
        print("".join(s))
        return
    for i in range(l, r + 1):
        s[l], s[i] = s[i], s[l]
        permute(s, l + 1, r)
        s[l], s[i] = s[i], s[l] # backtrack

def climb_stairs(n, path):
    if n == 0:
        print(path)
        return
    if n < 0:
        return
    
    climb_stairs(n - 1, path + "1 ")
    climb_stairs(n - 2, path + "2 ")

def grid_paths(r, c, R, C, path):
    if r == R - 1 and c == C - 1:
        print(path)
        return
    
    # Move Down
    if r < R - 1:
        grid_paths(r + 1, c, R, C, path + "D")
    
    # Move Right
    if c < C - 1:
        grid_paths(r, c + 1, R, C, path + "R")

if __name__ == "__main__":
    s = list("ABC")
    print(f"1. Permutations of {''.join(s)}:")
    permute(s, 0, len(s) - 1)
    
    n = 3
    print(f"\n2. Ways to climb {n} stairs:")
    climb_stairs(n, "")
    
    R, C = 2, 2
    print(f"\n3. Paths in a {R}x{C} grid:")
    grid_paths(0, 0, R, C, "")
