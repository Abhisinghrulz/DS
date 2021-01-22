package leetCodeLiked;

public class d3MaximalSquare {
    public static void main(String[] args) {
        //char [][] mat = {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}};
        char [][] mat = {{'1','1'},{'1','1'}};
        d3MaximalSquare d3MaximalSquare = new d3MaximalSquare();
        d3MaximalSquare.maximalSquare(mat);
    }
    public int maximalSquare(char[][] matrix) {

        int ans = 0;
        int [][] matrixInt = new int[matrix.length][matrix[0].length];

        for(int i =0; i<matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length; j++)
            {
                if(matrix[i][j] == '0')
                {
                    matrixInt[i][j] = 0;
                }
                else{
                    matrixInt[i][j] = 1;
                }
            }
        }

        for(int i =0; i<matrix[0].length; i++)
        {
            if(matrix[0][i]=='0')
            {
                ans = 1;break;
            }
        }

        for(int i =0; i<matrix.length; i++)
        {
            if(matrix[i][0]=='0')
            {
                ans = 1;break;
            }
        }

        for(int i =1; i<matrixInt.length; i++)
        {
            for(int j = 1; j<matrixInt[i].length; j++)
            {
                if(matrixInt[i][j]!=0)
                {
                    int left = matrixInt[i-1][j];
                    int up = matrixInt[i-1][j-1];
                    int right = matrixInt[i][j-1];
                    matrixInt[i][j] = Math.min(left,Math.min(up,right)) + 1;
                    ans = Math.max(ans,matrixInt[i][j]);
                }
            }
        }
        return ans * ans;
    }
}
