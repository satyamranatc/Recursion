// 1. Fibonacci number using recursion
function fib(n) {
    if (n <= 1) return n;
    return fib(n - 1) + fib(n - 2);
}

// 2. Count total function calls in Fibonacci
function countFibCalls(n) {
    if (n <= 1) return 1;
    return 1 + countFibCalls(n - 1) + countFibCalls(n - 2);
}

// 3. Print all subsets of a small array [1, 2]
function subsets(arr, index, current) {
    if (index === arr.length) {
        console.log(current);
        return;
    }
    
    // Include
    current.push(arr[index]);
    subsets(arr, index + 1, current);
    current.pop();
    
    // Exclude
    subsets(arr, index + 1, current);
}

// 4. Print all subsequences of a string "ab"
function subsequences(s, index, current) {
    if (index === s.length) {
        if (current === "") console.log("{}");
        else console.log(current);
        return;
    }
    
    // Include
    subsequences(s, index + 1, current + s[index]);
    
    // Exclude
    subsequences(s, index + 1, current);
}

const n = 5;
console.log(`1. Fibonacci of ${n}: ${fib(n)}`);

console.log(`2. Calls to calculate Fib(${n}): ${countFibCalls(n)}`);

const arr = [1, 2];
console.log(`\n3. Subsets of [${arr}]:`);
subsets(arr, 0, []);

const s = "ab";
console.log(`\n4. Subsequences of "${s}":`);
subsequences(s, 0, "");
