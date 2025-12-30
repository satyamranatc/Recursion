public class Level4 {

    // 1. Print all permutations of string
    public static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }

    // 2. Print all ways to climb stairs if you can take 1 or 2 steps
    public static void climbStairs(int n, String path) {
        if (n == 0) {
            System.out.println(path);
            return;
        }
        if (n < 0)
            return;

        climbStairs(n - 1, path + "1 ");
        climbStairs(n - 2, path + "2 ");
    }

    // 3. Print all paths in a R x C grid (Right and Down)
    public static void gridPaths(int r, int c, int R, int C, String path) {
        if (r == R - 1 && c == C - 1) {
            System.out.println(path);
            return;
        }

        // Move Down
        if (r < R - 1)
            gridPaths(r + 1, c, R, C, path + "D");

        // Move Right
        if (c < C - 1)
            gridPaths(r, c + 1, R, C, path + "R");
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("1. Permutations of " + s + ":");
        permute("", s);

        int n = 3;
        System.out.println("\n2. Ways to climb " + n + " stairs:");
        climbStairs(n, "");

        int R = 2, C = 2;
        System.out.println("\n3. Paths in a " + R + "x" + C + " grid:");
        gridPaths(0, 0, R, C, "");
    }
}
