package graph;

import java.util.LinkedList;
import java.util.Queue;

public class _547_NumberOfProvinces_Recursion {

    public static int findNumberOfProvinces(int[][] grid) {
        int N = grid.length;
        boolean[] visited = new boolean[N];
        int numProvinces = 0;

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(i, grid, visited, N);
                numProvinces++;
            }
        }

        return numProvinces;
    }

    private static void dfs(int i, int[][] grid, boolean[] visited, int N) {
        for (int j = 0; j < N; j++) {
            if (grid[i][j] == 1 && !visited[j]) {
                visited[j] = true;
                dfs(j, grid, visited, N);
            }
        }
    }


    public static void main(String[] args) {
        int[][] a = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println(findNumberOfProvinces(a));
        int[][] b = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        System.out.println(findNumberOfProvinces(b));
    }
}
