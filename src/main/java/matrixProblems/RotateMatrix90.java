package matrixProblems;

public class RotateMatrix90 {
    public int[][] rotateMatrixInPlace(int[][] matrix) {
        int length = matrix.length - 1;
        for(int i =0; i< matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                int p1 = matrix[i][j];
                int p2 = matrix[j][length-i];
                int p3 = matrix[length-i][length-j];
                int p4 = matrix[length-j][i];

                matrix[j][length-i] = p1;
                matrix[length-i][length-j] = p2;
                matrix[length-j][i] = p3;
                matrix[i][j] = p4;
            }
        }
        return matrix;
    }
}
