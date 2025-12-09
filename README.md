# 🔄 Recursion: A Complete Guide

## 📚 Table of Contents
- [What is Recursion?](#what-is-recursion)
- [How Recursion Works in Memory](#how-recursion-works-in-memory)
- [The Call Stack](#the-call-stack)
- [Base Case vs Recursive Case](#base-case-vs-recursive-case)
- [Memory Visualization](#memory-visualization)
- [Types of Recursion](#types-of-recursion)
- [Recursion vs Iteration](#recursion-vs-iteration)
- [Common Pitfalls](#common-pitfalls)
- [Practice Problems](#practice-problems)

---

## 🤔 What is Recursion?

**Recursion** is when a function calls itself to solve a problem by breaking it down into smaller, similar subproblems.

### Real-Life Analogy
Imagine you're looking for a book in a stack of books:
1. Check the top book
2. If it's not the one you want, remove it and **repeat the same process** with the remaining stack
3. Stop when you find the book or the stack is empty

This is recursion - solving a problem by doing the same thing on a smaller version of the problem!

---

## 🧠 How Recursion Works in Memory

### The Call Stack

Every time a function is called, the computer creates a **stack frame** containing:
- Function parameters
- Local variables
- Return address (where to go back after the function completes)

These stack frames are stored in a special memory area called the **Call Stack**.

### Stack Frame Structure

```
┌─────────────────────────┐
│  Stack Frame 3          │  ← Top of stack (most recent call)
│  - Parameters           │
│  - Local variables      │
│  - Return address       │
├─────────────────────────┤
│  Stack Frame 2          │
│  - Parameters           │
│  - Local variables      │
│  - Return address       │
├─────────────────────────┤
│  Stack Frame 1          │  ← Bottom of stack (first call)
│  - Parameters           │
│  - Local variables      │
│  - Return address       │
└─────────────────────────┘
```

---

## 📊 Memory Visualization

Let's see how memory works with a simple example: `factorial(3)`

```java
int factorial(int n) 
{
    if (n == 0) return 1;        // Base case
    return n * factorial(n - 1);  // Recursive case
}
```

### Step-by-Step Memory Flow

#### **Phase 1: Going Down (Building the Stack)**

```
Call: factorial(3)
┌──────────────────┐
│ factorial(3)     │
│ n = 3            │  Waiting for factorial(2)
│ return 3 * ?    │
└──────────────────┘

Call: factorial(2)
┌──────────────────┐
│ factorial(2)     │
│ n = 2            │  Waiting for factorial(1)
│ return 2 * ?    │
├──────────────────┤
│ factorial(3)     │
│ n = 3            │
│ return 3 * ?    │
└──────────────────┘

Call: factorial(1)
┌──────────────────┐
│ factorial(1)     │
│ n = 1            │  Waiting for factorial(0)
│ return 1 * ?    │
├──────────────────┤
│ factorial(2)     │
│ n = 2            │
│ return 2 * ?    │
├──────────────────┤
│ factorial(3)     │
│ n = 3            │
│ return 3 * ?    │
└──────────────────┘

Call: factorial(0)
┌──────────────────┐
│ factorial(0)     │
│ n = 0            │  ✅ BASE CASE! Return 1
│ return 1        │
├──────────────────┤
│ factorial(1)     │
│ n = 1            │
│ return 1 * ?    │
├──────────────────┤
│ factorial(2)     │
│ n = 2            │
│ return 2 * ?    │
├──────────────────┤
│ factorial(3)     │
│ n = 3            │
│ return 3 * ?    │
└──────────────────┘
```

#### **Phase 2: Coming Back Up (Unwinding the Stack)**

```
factorial(0) returns 1
┌──────────────────┐
│ factorial(1)     │
│ n = 1            │  Now knows: 1 * 1 = 1
│ return 1        │  ← Returns 1
├──────────────────┤
│ factorial(2)     │
│ n = 2            │
│ return 2 * ?    │
├──────────────────┤
│ factorial(3)     │
│ n = 3            │
│ return 3 * ?    │
└──────────────────┘

factorial(1) returns 1
┌──────────────────┐
│ factorial(2)     │
│ n = 2            │  Now knows: 2 * 1 = 2
│ return 2        │  ← Returns 2
├──────────────────┤
│ factorial(3)     │
│ n = 3            │
│ return 3 * ?    │
└──────────────────┘

factorial(2) returns 2
┌──────────────────┐
│ factorial(3)     │
│ n = 3            │  Now knows: 3 * 2 = 6
│ return 6        │  ← Returns 6
└──────────────────┘

Final Answer: 6
```

---

## 🎯 Base Case vs Recursive Case

Every recursive function MUST have:

### 1. **Base Case** (Stopping Condition)
- The simplest version of the problem that can be solved directly
- Prevents infinite recursion
- **Without this, your program will crash with "Stack Overflow"**

### 2. **Recursive Case** (The Reduction)
- Breaks the problem into smaller subproblems
- Calls the function again with modified parameters
- Must move towards the base case

### Example:
```java
int sum(int n) 
{
    // BASE CASE: When n is 0, sum is 0
    if (n == 0) return 0;
    
    // RECURSIVE CASE: Add n to sum of remaining numbers
    return n + sum(n - 1);
}
```

---

## 🔍 Types of Recursion

### 1. **Direct Recursion**
Function calls itself directly.
```java
void printNumbers(int n) 
{
    if (n == 0) return;
    printNumbers(n - 1);  // Calls itself
    System.out.print(n + " ");
}
```

### 2. **Indirect Recursion**
Function A calls function B, which calls function A.
```java
void functionA(int n) 
{
    if (n > 0) 
    {
        System.out.print(n + " ");
        functionB(n - 1);  // Calls B
    }
}

void functionB(int n) 
{
    if (n > 0) 
    {
        System.out.print(n + " ");
        functionA(n - 1);  // Calls A
    }
}
```

### 3. **Tail Recursion**
Recursive call is the last operation in the function.
```java
int factorial(int n, int result) 
{
    if (n == 0) return result;
    return factorial(n - 1, n * result);  // Last operation
}
```

### 4. **Head Recursion**
Recursive call is the first operation.
```java
void printNumbers(int n) 
{
    if (n == 0) return;
    printNumbers(n - 1);  // First operation
    System.out.print(n + " ");
}
```

---

## ⚖️ Recursion vs Iteration

| Aspect | Recursion | Iteration (Loops) |
|--------|-----------|-------------------|
| **Memory** | Uses call stack (more memory) | Uses variables (less memory) |
| **Speed** | Slower (function call overhead) | Faster |
| **Code** | Often cleaner and shorter | Can be longer |
| **Readability** | More intuitive for some problems | Better for simple repetitions |
| **Risk** | Stack overflow if too deep | No such risk |
| **Best For** | Tree traversal, divide & conquer | Simple counting, arrays |

### Same Problem, Both Ways:

**Recursive:**
```java
int sum(int n) 
{
    if (n == 0) return 0;
    return n + sum(n - 1);
}
```

**Iterative:**
```java
int sum(int n) 
{
    int total = 0;
    for (int i = 1; i <= n; i++) 
    {
        total += i;
    }
    return total;
}
```

---

## 🧮 Memory Usage Example

Let's calculate memory for `factorial(5)`:

```
Call Stack Depth: 6 (factorial(5) → factorial(4) → ... → factorial(0))

Each stack frame contains:
- Parameter n: 4 bytes (int)
- Return address: 8 bytes
- Other overhead: ~8 bytes
Total per frame: ~20 bytes

Total memory: 6 frames × 20 bytes = 120 bytes
```

**For factorial(1000):**
- Stack depth: 1001 frames
- Memory: ~20 KB
- **Risk: Stack overflow if stack size limit is exceeded!**

---

## ⚠️ Common Pitfalls

### 1. **Missing Base Case**
```java
// ❌ WRONG - Infinite recursion!
int bad(int n) 
{
    return n + bad(n - 1);  // Never stops!
}
```

### 2. **Base Case Never Reached**
```java
// ❌ WRONG - n never becomes 0!
int bad(int n) 
{
    if (n == 0) return 0;
    return n + bad(n + 1);  // Going in wrong direction!
}
```

### 3. **Multiple Unnecessary Calls**
```java
// ❌ INEFFICIENT - Calculates same values multiple times
int fibonacci(int n) 
{
    if (n <= 1) return n;
    return fibonacci(n-1) + fibonacci(n-2);  // Lots of duplicate work!
}
```

### 4. **Stack Overflow**
```java
// ❌ DANGEROUS - Too many recursive calls
factorial(100000);  // Will crash!
```

---

## 🎓 Practice Problems

This repository contains 17 recursion problems organized by difficulty:

### **Beginner (Understanding Basics)**
1. Print numbers 1 to N
2. Print numbers N to 1
3. Sum of digits
4. Count digits
5. Power function

### **Intermediate (Working with Data Structures)**
6. Maximum in array
7. Sum of array
8. Linear search
9. Check if sorted
10. Reverse string
11. Remove character
12. Replace substring

### **Advanced (Divide and Conquer)**
13. Merge sorted arrays
14. Maximum using divide & conquer
15. Minimum using divide & conquer
16. Merge linked lists
17. Sort string (merge sort)

---

## 📁 Repository Structure

```
Recuresion/
├── Java Code/          # All Java implementations
│   ├── Problem01_PrintIncreasing.java
│   ├── Problem02_PrintDecreasing.java
│   └── ... (15 more files)
├── Cpp code/           # All C++ implementations
│   ├── Problem01_PrintIncreasing.cpp
│   ├── Problem02_PrintDecreasing.cpp
│   └── ... (15 more files)
└── README.md          # This file
```

---

## 💡 Tips for Learning Recursion

1. **Draw the recursion tree** - Visualize how calls branch out
2. **Trace with small inputs** - Use n=3 or n=4, not n=100
3. **Trust the recursion** - Assume smaller calls work correctly
4. **Identify the pattern** - What's the relationship between f(n) and f(n-1)?
5. **Start simple** - Master basic problems before tackling complex ones
6. **Practice regularly** - Recursion becomes intuitive with practice

---

## 🚀 Quick Start

### Java
```bash
cd "Java Code"
javac Problem01_PrintIncreasing.java
java Problem01_PrintIncreasing
```

### C++
```bash
cd "Cpp code"
g++ Problem01_PrintIncreasing.cpp -o problem01
./problem01
```

---

## 📖 Further Reading

- **Recursion Tree Method** - For analyzing time complexity
- **Master Theorem** - For divide and conquer algorithms
- **Dynamic Programming** - Optimizing recursive solutions
- **Tail Call Optimization** - Compiler optimizations for recursion

---

## 🎯 Key Takeaways

✅ Recursion is a function calling itself  
✅ Every recursive function needs a base case  
✅ The call stack stores all active function calls  
✅ Each recursive call uses memory (stack frame)  
✅ Too many calls can cause stack overflow  
✅ Recursion is elegant but uses more memory than loops  
✅ Some problems are naturally recursive (trees, graphs)  
✅ Practice makes recursion intuitive!  

---

**Happy Coding! 🎉**

*Remember: The best way to understand recursion is to understand recursion.* 😉
