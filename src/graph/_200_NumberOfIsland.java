package graph;

public class _200_NumberOfIsland {
    static int numIslands(char[][] grid) {
        int count = 0;

        // Duyệt qua matrix
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == '1') {
                    count++;
                    DFS(grid, x, y);
                }

            }
        }
        return count;
    }

    static void DFS(char[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || grid[x][y] == '0') return;
        grid[x][y] = '0';
        DFS(grid, x + 1, y);
        DFS(grid, x - 1, y);
        DFS(grid, x, y + 1);
        DFS(grid, x, y - 1);
    }

    public static void main(String[] args) {
        char[][] graph = {{'1'}, {'1'}};
        numIslands(graph);
    }
}
