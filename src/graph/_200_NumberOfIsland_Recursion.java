package graph;

public class _200_NumberOfIsland_Recursion {
    static int numIslands(char[][] grid) {
        int count = 0;

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
        System.out.println(numIslands(graph));
    }
}
