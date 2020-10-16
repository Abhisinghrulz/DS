package dp.dpProblems.minNoOfJumps;

/**
 * DP - Minimum jumps to reach Nth Stair
 */
public class MinStair {
    public int minStepsBottomUp(int n) {
        int[] f = new int[n + 1];

        f[0] = 0;
        f[1] = 1;
        f[2] = 1;

        for (int i = 3; i <= n; i++) {
            f[i] = 1 + Math.min(Math.min(f[i - 1], f[i - 2]), f[i - 3]);
        }

        return f[n];
    }

    public static void main(String[] args) {
        MinStair minStair = new MinStair();
        System.out.println(minStair.minStepsBottomUp(4));
    }
}
