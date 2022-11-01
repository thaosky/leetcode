package graph;

public class _463_IslandPerimeter {
    public static int islandPerimeter(int[][] grid) {

        // TODO
        int row = grid.length;
        int col = grid[0].length;

        int countLand = 0;
        int countWaterAdjacentLand = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    countLand++;
                }
                if (grid[i][j] == 0) {
                    countWaterAdjacentLand++;
                }
            }
        }
        return countLand;
    }

    private static int dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1) return 0;
        if (grid[x][y] == 0) {
            return -1;
        }
        if (grid[x][y] == 1) {
            grid[x][y] = 2;
            return  4 + dfs(grid, x + 1, y)
                    + dfs(grid, x - 1, y)
                    + dfs(grid, x, y + 1)
                    + dfs(grid, x, y - 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        System.out.println(islandPerimeter(grid));
    }
}
