package array.squareOfSortedArray;

public class SquareOfSortedArray {
    public static void main(String[] args) {

        int [] arr = {-4, -1, 0, 3, 10};
        SquareOfSortedArray squareOfSortedArray = new SquareOfSortedArray();
        int[] ints = squareOfSortedArray.sortedSquares(arr);
        for(int a : ints)
        {
            System.out.println(a);
        }

    }
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int positive_counter = 0;
        while (positive_counter < n && arr[positive_counter] < 0) {
            positive_counter++;
        }
        int negative_counter = positive_counter - 1;
        int[] sorted_squares = new int[n];
        int counter = 0;

        while (negative_counter >= 0 && positive_counter < n) {
            if (arr[negative_counter] * arr[negative_counter] < arr[positive_counter] * arr[positive_counter]) {
                sorted_squares[counter] = arr[negative_counter] * arr[negative_counter];
                negative_counter--;
            } else {
                sorted_squares[counter] = arr[positive_counter] * arr[positive_counter];
                positive_counter++;
            }
            counter++;
        }

        while (negative_counter >=0)
        {
            sorted_squares[counter] = arr[negative_counter] * arr[negative_counter];
            negative_counter--;
            counter++;
        }

        while (positive_counter<n)
        {
            sorted_squares[counter] = arr[positive_counter] * arr[positive_counter];
            positive_counter++;
            counter++;
        }
        return sorted_squares;

    }
}
