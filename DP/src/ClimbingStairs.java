// count ways to reach the nth stair. The person can climb either 1 or 2 staris
public class ClimbingStairs {
    // recursion
    public static int climb(int n, int position, String steps) {
        if (position == n) {
            return 1;
        }
        if (position > n) {
            return 0;
        }
        return climb(n, position + 1, steps + "1") + climb(n, position + 2, steps + "2");
    }

    // memoization
    public static int climbMem(int n, int position, int[] mem) {
        if (position == n) {
            return 1;
        }
        if (position > n) {
            return 0;
        }
        if (mem[position] != 0) {
            return mem[position];
        }
        mem[position] = climbMem(n, position + 1, mem) + climbMem(n, position + 2, mem);
        return mem[position];
    }

    // tabulation
    public static int climbTabulation(int n) {
        int tab[] = new int[n + 1];
        tab[0] = 1;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
        }
        return tab[n];
    }

    public static void main(String[] args) throws Exception {
        int n = 10;
        // climb(n, 0, "");
        // System.out.println("Total Ways: " + count);
        // int mem[] = new int[n + 1];
        // System.out.println(climbMem(n, 0, mem));
        System.out.println(climbTabulation(n));
    }
}
