package misc.matrixNoOfIsland.maxAreaOfIsland;

public class MaxAreaOfIsland {

    public static void main(String[] args) {
        int [][] arr= {{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,0,0,0}};
        MaxAreaOfIsland mai = new MaxAreaOfIsland();
        System.out.println(mai.maxAreaOfIsland(arr));
    }

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int count = 1;
        count += dfs(grid, i+1, j);
        count += dfs(grid, i-1, j);
        count += dfs(grid, i, j+1);
        count += dfs(grid, i, j-1);
        return count;

    }
}
