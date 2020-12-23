package rough;

public class Quest1 {
    static int[] arr = {1, 5, 4, 3, 6};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            printREIsMax(i);
        }
    }

    private static void printREIsMax(int pos) {
        int min = pos, max = pos;
        while (min >= 0 && arr[min] <= arr[pos]) min--;
        while (max < arr.length && arr[max] <= arr[pos]) max++;
        System.out.println(arr[pos] + "[" + (min + 2) + "," + (max) + "]");
    }
}
