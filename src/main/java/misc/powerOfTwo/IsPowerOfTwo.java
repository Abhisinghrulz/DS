package misc.powerOfTwo;

public class IsPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(IsPowerOfTwo.isPowerOfTwo(32));
    }

    public static boolean isPowerOfTwo(int n) {
        long i = 1;
        while (i < n) {
            i = i * 2;
        }
        return i == n;
    }
}
