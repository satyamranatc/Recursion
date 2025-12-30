public class Level0 {
    
    // 1. Print numbers from n to 1
    public static void printNto1(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        printNto1(n - 1);
    }

    // 2. Print numbers from 1 to n
    public static void print1toN(int n) {
        if (n == 0) return;
        print1toN(n - 1);
        System.out.print(n + " ");
    }

    // 3. Find factorial of n
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // 4. Find sum of first n numbers
    public static int sumN(int n) {
        if (n == 0) return 0;
        return n + sumN(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.print("1. Print n to 1: ");
        printNto1(n);
        System.out.println();

        System.out.print("2. Print 1 to n: ");
        print1toN(n);
        System.out.println();

        System.out.println("3. Factorial of " + n + ": " + factorial(n));

        System.out.println("4. Sum of first " + n + " numbers: " + sumN(n));
    }
}
