package matrixProblems;

public class PrintMatrixBy90 {

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
        };
        PrintMatrixBy90 printMatrixBy90 = new PrintMatrixBy90();
        printMatrixBy90.printMatrixInSpiralWay(a);
    }

    public void printMatrixInSpiralWay(int[][] matrix) {
        int rowStart = 0;
        int rowLength = matrix.length - 1;
        int colStart = 0;
        int colLength = matrix[0].length - 1;

        while (rowStart <= rowLength && colStart <= colLength) {
            for(int i = rowStart; i<=colLength; i++){
                System.out.print(matrix[rowStart][i]+ " ");
            }
            for(int j = rowStart+1; j<=rowLength; j++)
            {
                System.out.print(matrix[j][colLength]+ " ");
            }
            if(rowStart+1<=rowLength)
            {
                for(int k =colLength-1; k>=colStart; k--)
                {
                    System.out.print(matrix[rowLength][k]+ " ");
                }
            }
            if(colStart+1<=colLength)
            {
                for(int k = rowLength-1; k>rowStart; k--){
                    System.out.print(matrix[k][colStart]+ " ");
                }
            }
            rowStart++;
            rowLength--;
            colStart++;
            colLength--;
        }
    }
}

