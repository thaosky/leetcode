package graph;

import java.util.ArrayList;
import java.util.Stack;

public class _200_NumberOfIsland_DFS {
    ArrayList
    static int numIslands(char[][] grid) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();

        int m = grid.length;
        int n = grid[0].length;
        boolean[] visited = new boolean[n+1];

        visited[0] = true;
        stack.push(0);

        while (!stack.isEmpty()) {
            for (int i = 0; i < n; i++) {

            }
        }

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
