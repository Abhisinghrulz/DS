package search.binarySearch;

public class LastOccurence {
    public int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                res = mid;
                start = mid + 1;
            } else if (key < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 12, 20};
        LastOccurence lastOccurence = new LastOccurence();
        System.out.println(lastOccurence.binarySearch(arr, 10));
    }
}

