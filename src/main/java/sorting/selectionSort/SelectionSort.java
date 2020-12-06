package sorting.selectionSort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 4, 1, 11, 4, 2};
        int temp, pos;
        for (int i = 0; i < arr.length; i++) {
            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[pos]) {
                    pos = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[pos];
        }
    }
}
