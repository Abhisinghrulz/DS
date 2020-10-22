package array.dutchflag012;

public class DutchFlag {
    public static void sort012(int[] arr, int arrSize) {
        int low = 0;
        int mid = 0;
        int high = arrSize - 1;
        int temp = 0;

        while (mid <= high) {
            int c = arr[mid];
            if (c == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (c == 1) {
                mid++;
            } else if (c == 2) {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    /* Utility function to print array arr[] */
    static void printArray(int arr[], int arr_size) {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        sort012(arr, arr_size);
        System.out.println("Array after segregation ");
        printArray(arr, arr_size);
    }
}
