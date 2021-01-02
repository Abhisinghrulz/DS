package matrixProblems;

public class TransposeMatrix {
    public int [][] transposeMatrix(int [][] matrix){
        int [][] transposeMatrix = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
}
