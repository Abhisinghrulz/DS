package array.slidingWindow.sum3Closest;

public class Sum3Closest {
    static int maxSum(int arr[], int n, int k, int target) {
        if (target < 0) {
            System.out.println("Invalid");
            return -1;
        }
        target = arr[target];
        // Compute sum of first window of size k
        int sum = 0;
        int closestSum = 0;
        for (int i = 0; i < k; i++)
            sum += arr[i];

        closestSum = Math.abs(sum - target);

        int window_sum = sum;
        int finalsum = sum;
        for (int i = k; i < n; i++) {
            window_sum += arr[i] - arr[i - k];
            if (closestSum < Math.abs(sum - target)) {
                closestSum = Math.abs(sum - target);
                finalsum = window_sum;
            }
        }

        return finalsum;
    }

    public static void main(String[] args) {
        Sum3Closest sum3Closest = new Sum3Closest();
        int [] arr = {-1, 2, 1, -4};
        int i = sum3Closest.maxSum(arr, arr.length, 3, 2);
        System.out.println(i);
    }

}
