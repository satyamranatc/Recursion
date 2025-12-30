// 1. Print all possible binary strings of length n
function generateBinary(n, current) {
    if (n === 0) {
        console.log(current);
        return;
    }
    generateBinary(n - 1, current + "0");
    generateBinary(n - 1, current + "1");
}

// 2. Print all paths using L and R for n steps
function generatePaths(n, path) {
    if (n === 0) {
        console.log(path);
        return;
    }
    generatePaths(n - 1, path + "L");
    generatePaths(n - 1, path + "R");
}

// 3. Print all combinations of choosing left or right n times
function generateCombinations(n, combo) {
    if (n === 0) {
        console.log(combo);
        return;
    }
    generateCombinations(n - 1, combo + "Left ");
    generateCombinations(n - 1, combo + "Right ");
}

const n = 3;

console.log(`1. Binary strings of length ${n}:`);
generateBinary(n, "");

console.log(`\n2. Paths (L/R) for ${n} steps:`);
generatePaths(n, "");

console.log(`\n3. Combinations (Left/Right) for ${n} choices:`);
generateCombinations(n, "");
