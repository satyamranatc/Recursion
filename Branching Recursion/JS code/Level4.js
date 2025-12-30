// 1. Print all permutations of string
function permute(prefix, remaining) {
    if (remaining.length === 0) {
        console.log(prefix);
        return;
    }
    for (let i = 0; i < remaining.length; i++) {
        permute(prefix + remaining[i], 
                remaining.substring(0, i) + remaining.substring(i + 1));
    }
}

// 2. Print all ways to climb stairs if you can take 1 or 2 steps
function climbStairs(n, path) {
    if (n === 0) {
        console.log(path);
        return;
    }
    if (n < 0) return;
    
    climbStairs(n - 1, path + "1 ");
    climbStairs(n - 2, path + "2 ");
}

// 3. Print all paths in a R x C grid (Right and Down)
function gridPaths(r, c, R, C, path) {
    if (r === R - 1 && c === C - 1) {
        console.log(path);
        return;
    }
    
    // Move Down
    if (r < R - 1) gridPaths(r + 1, c, R, C, path + "D");
    
    // Move Right
    if (c < C - 1) gridPaths(r, c + 1, R, C, path + "R");
}

const s = "ABC";
console.log(`1. Permutations of ${s}:`);
permute("", s);

const n = 3;
console.log(`\n2. Ways to climb ${n} stairs:`);
climbStairs(n, "");

const R = 2, C = 2;
console.log(`\n3. Paths in a ${R}x${C} grid:`);
gridPaths(0, 0, R, C, "");
