package misc.powerOfANumber;

public class PowerOfANumber {
    // Java program to find the power of a number
// using Recursion
    // Function to calculate N raised to the power P
    static int power(int N, int P) {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }

    // Driver code
    public static void main(String[] args) {
        int N = 2;
        int P = 3;

        System.out.println(power(N, P));
    }
}


