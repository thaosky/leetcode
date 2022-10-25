package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_matrix {
    static void bfs(int[][] graph) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.length + 1];
        queue.add(0);
        visited[0] = true;
        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.println("Thăm đỉnh " + u);
            for (int v = 0; v < graph[u].length; v++) {
                if (graph[u][v] == 1 && !visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}};
        bfs(graph);
    }
}
