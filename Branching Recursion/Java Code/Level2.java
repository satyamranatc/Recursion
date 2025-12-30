public class Level2 {

    // 1. Print all possible binary strings of length n
    public static void generateBinary(int n, String current) {
        if (n == 0) {
            System.out.println(current);
            return;
        }
        generateBinary(n - 1, current + "0");
        generateBinary(n - 1, current + "1");
    }

    // 2. Print all paths using L and R for n steps
    public static void generatePaths(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }
        generatePaths(n - 1, path + "L");
        generatePaths(n - 1, path + "R");
    }

    // 3. Print all combinations of choosing left or right n times
    public static void generateCombinations(int n, String combo) {
        if (n == 0) {
            System.out.println(combo);
            return;
        }
        generateCombinations(n - 1, combo + "Left ");
        generateCombinations(n - 1, combo + "Right ");
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println("1. Binary strings of length " + n + ":");
        generateBinary(n, "");

        System.out.println("\n2. Paths (L/R) for " + n + " steps:");
        generatePaths(n, "");

        System.out.println("\n3. Combinations (Left/Right) for " + n + " choices:");
        generateCombinations(n, "");
    }
}
