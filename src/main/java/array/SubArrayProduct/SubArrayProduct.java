package array.SubArrayProduct;

// arr = [10, 5, 2, 6] k = 100
//output = 8
// All the pairs whose product is less than 100
public class SubArrayProduct {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 6};
        int k = 100;
        SubArrayProduct subArrayProduct = new SubArrayProduct();
        int i = subArrayProduct.numSubArrayProductLessThanK(arr, k);
        System.out.println(i);
    }

    public int numSubArrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) {
            return 0;
        }

        int prod = 1;
        int result = 0;

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            prod = prod * nums[right];

            while (prod >= k) {
                prod = prod / nums[left];
                left++;
            }
            result = result + right - left + 1;
            right++;
        }
        return result;
    }
}
