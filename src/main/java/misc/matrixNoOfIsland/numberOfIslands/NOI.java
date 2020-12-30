package misc.matrixNoOfIsland.numberOfIslands;

/**
 * https://www.youtube.com/watch?v=o8S2bO3pmO4&list=PLi9RQVmJD2fZGdIX-y3-X37YUAWxh6GqH&index=10
 *
 * https://leetcode.com/problems/number-of-islands/
 */
public class NOI {
    public static void main(String[] args) {
        char [][] arr= {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        NOI noi = new NOI();
        System.out.println(noi.numOfIslands(arr));
    }

    public int numOfIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int numberOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    numberOfIslands += dfs(grid, i, j);
                }
            }
        }
        return numberOfIslands;
    }

    private int dfs(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == '0') {
            return 0;
        }
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
        return 1;
    }
}