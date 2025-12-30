// 1. Print numbers from n to 1
function printNto1(n) {
    if (n === 0) return;
    process.stdout.write(n + " ");
    printNto1(n - 1);
}

// 2. Print numbers from 1 to n
function print1toN(n) {
    if (n === 0) return;
    print1toN(n - 1);
    process.stdout.write(n + " ");
}

// 3. Find factorial of n
function factorial(n) {
    if (n === 0 || n === 1) return 1;
    return n * factorial(n - 1);
}

// 4. Find sum of first n numbers
function sumN(n) {
    if (n === 0) return 0;
    return n + sumN(n - 1);
}

const n = 5;

process.stdout.write("1. Print n to 1: ");
printNto1(n);
console.log();

process.stdout.write("2. Print 1 to n: ");
print1toN(n);
console.log();

console.log(`3. Factorial of ${n}: ${factorial(n)}`);

console.log(`4. Sum of first ${n} numbers: ${sumN(n)}`);
