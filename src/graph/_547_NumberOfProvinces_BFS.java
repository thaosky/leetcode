package graph;

import java.util.*;

public class _547_NumberOfProvinces_BFS {

    public static int findNumberOfProvinces(int[][] grid) {
        int N = grid.length;
        boolean[] visited = new boolean[N];
        int numProvinces = 0;

        for (int city = 0; city < N; city++) {
            if (!visited[city]) {
                bfs(city, grid, visited, N);
                numProvinces++;
            }
        }

        return numProvinces;
    }

    private static void bfs(int startCity, int[][] grid, boolean[] visited, int N) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startCity);
        visited[startCity] = true;

        while (!queue.isEmpty()) {
            int visitedCity = queue.remove();
            for (int neighbour = 0; neighbour < N; neighbour++) {
                if (grid[visitedCity][neighbour] == 1 && !visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;
                }
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
