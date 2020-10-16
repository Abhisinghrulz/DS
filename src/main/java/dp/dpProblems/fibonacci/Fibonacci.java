package dp.dpProblems.fibonacci;

public class Fibonacci {
    private int getFibonacciNumberBottomUp(int n) {
        int[] f = new int[n + 1];

        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.getFibonacciNumberBottomUp(6));
    }
}
