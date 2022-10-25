package graph;

import java.util.Stack;

public class DFS_matrix {
    static void dfs(int[][] graph) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[graph.length + 1];
        stack.push(0);
        visited[0] = true;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            System.out.println("Thăm đỉnh " + u);
            for (int v = 0; v < graph[u].length; v++) {
                if (graph[u][v] == 1 && !visited[v]) {
                    stack.push(v);
                    visited[v] = true;
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
        dfs(graph);
    }
}
