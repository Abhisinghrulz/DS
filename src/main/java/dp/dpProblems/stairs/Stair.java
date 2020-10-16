package dp.dpProblems.stairs;

/**
 * DP - Total Number of ways to reach nth Stair
 */
public class Stair {

    public int totalWaysToReachNthStairBottomUp(int n) {
        int[] f = new int[n + 1];

        f[0] = 1;
        f[1] = 1;
        f[2] = 2;

        for(int i = 3; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2] + f[i -3];
        }

        return f[n];
    }

    public static void main(String[] args) {
        Stair a = new Stair();
        System.out.println(a.totalWaysToReachNthStairBottomUp(3));

    }
}
