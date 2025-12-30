// 1. Print n two times using recursion
function printTwoTimes(n) {
    if (n === 0) return;
    process.stdout.write(n + " ");
    printTwoTimes(n - 1);
    process.stdout.write(n + " ");
}

// 2. Print n then call the function twice with n-1
function printBranching(n) {
    if (n === 0) return;
    process.stdout.write(n + " ");
    printBranching(n - 1);
    printBranching(n - 1);
}

// 3. Count how many times a function is called
function countCalls(n) {
    if (n === 0) return 1;
    return 1 + countCalls(n - 1) + countCalls(n - 1);
}

const n = 3;

process.stdout.write("1. Print n two times: ");
printTwoTimes(n);
console.log();

process.stdout.write(`2. Branching Recursion (n=${n}): `);
printBranching(n);
console.log();

const m = 2;
console.log(`3. Total function calls for n=${m}: ${countCalls(m)}`);
