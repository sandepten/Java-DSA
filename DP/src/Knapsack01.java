public class Knapsack01 {
    static int values[] = { 15, 14, 10, 45, 30 };
    static int weights[] = { 2, 5, 1, 3, 4 };
    static int maxWeight = 7;

    public static int knapsackRec(int currWeight, int index) {
        if (index == values.length) {
            return 0;
        }
        int remainingWeight = maxWeight - currWeight;
        if (weights[index] <= remainingWeight) {
            int ans1 = knapsackRec(currWeight + weights[index], index + 1) + values[index];
            int ans2 = knapsackRec(currWeight, index + 1);
            return Math.max(ans1, ans2);
        } else {
            return knapsackRec(currWeight, index + 1);
        }
    }

    public static int knapsackMem(int remainingWeight, int index, int mem[][]) {
        if (remainingWeight == 0 || index == 0) {
            return 0;
        }
        if (mem[index][remainingWeight] != -1) {
            return mem[index][remainingWeight];
        }
        if (weights[index - 1] <= remainingWeight) {
            int ans1 = values[index - 1] + knapsackMem(remainingWeight - weights[index - 1], index - 1, mem);
            int ans2 = knapsackMem(remainingWeight, index - 1, mem);
            mem[index][remainingWeight] = Math.max(ans1, ans2);
            return mem[index][remainingWeight];
        } else {
            mem[index][remainingWeight] = knapsackMem(remainingWeight, index - 1, mem);
            return mem[index][remainingWeight];
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(knapsackRec(0, 0));

        int[][] mem = new int[values.length + 1][maxWeight + 1];
        for (int i = 0; i < mem.length; i++) {
            for (int j = 0; j < mem[i].length; j++) {
                mem[i][j] = -1;
            }
        }
        System.out.println(knapsackMem(maxWeight, values.length, mem));
    }
}
