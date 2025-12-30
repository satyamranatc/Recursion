import java.util.ArrayList;
import java.util.List;

public class Level3 {

    // 1. Fibonacci number using recursion
    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
// fib(4)
// ├── fib(3)
// │   ├── fib(2)
// │   │   ├── fib(1) → 1
// │   │   └── fib(0) → 0
// │   │   └── fib(2) → 1
// │   └── fib(1) → 1
// │   └── fib(3) → 2
// │
// └── fib(2)
//     ├── fib(1) → 1
//     └── fib(0) → 0
//     └── fib(2) → 1

// fib(4) → 3

    // 2. Count total function calls in Fibonacci
    public static int countFibCalls(int n) {
        if (n <= 1)
            return 1;
        return 1 + countFibCalls(n - 1) + countFibCalls(n - 2);
    }

    // 3. Print all subsets of a small array [1, 2]
    public static void subsets(int[] arr, int index, List<Integer> current) {
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Include
        current.add(arr[index]);
        subsets(arr, index + 1, current);
        current.remove(current.size() - 1);

        // Exclude
        subsets(arr, index + 1, current);
    }

    // 4. Print all subsequences of a string "ab"
    public static void subsequences(String s, int index, String current) {
        if (index == s.length()) {
            if (current.isEmpty())
                System.out.println("{}");
            else
                System.out.println(current);
            return;
        }

        // Include
        subsequences(s, index + 1, current + s.charAt(index));

        // Exclude
        subsequences(s, index + 1, current);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("1. Fibonacci of " + n + ": " + fib(n));

        System.out.println("2. Calls to calculate Fib(" + n + "): " + countFibCalls(n));

        int[] arr = { 1, 2 };
        System.out.println("\n3. Subsets of {1, 2}:");
        subsets(arr, 0, new ArrayList<>());

        String s = "ab";
        System.out.println("\n4. Subsequences of \"ab\":");
        subsequences(s, 0, "");
    }
}
