package leetCodeLiked;

public class d6SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int left = 0;
        int right = rows * columns - 1;

        while (left <= right) {
            int midPoint = left + (right - left) / 2;
            int midPoint_element = matrix[midPoint / columns][midPoint % columns];
            if (midPoint_element == target) {
                return true;
            } else if (target < midPoint_element) {
                right = midPoint - 1;
            } else if (target > midPoint_element) {
                left = midPoint + 1;
            }
        }
        return false;
    }
}
