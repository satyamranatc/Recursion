public class Level1 {

    // 1. Print n two times using recursion (Pre and Post area)
    public static void printTwoTimes(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printTwoTimes(n - 1);
        System.out.print(n + " ");
    }

    // 2. Print n then call the function twice with n-1
    public static void printBranching(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printBranching(n - 1);
        printBranching(n - 1);
    }

    // 3. Count how many times a function is called
    public static int countCalls(int n) {
        if (n == 0)
            return 1;
        return 1 + countCalls(n - 1) + countCalls(n - 1);
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.print("1. Print n two times: ");
        printTwoTimes(n);
        System.out.println();

        System.out.print("2. Branching Recursion (n=" + n + "): ");
        printBranching(n);
        System.out.println();

        int m = 2;
        System.out.println("3. Total function calls for n=" + m + ": " + countCalls(m));
    }
}
