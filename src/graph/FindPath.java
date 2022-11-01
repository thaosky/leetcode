package graph;

import java.util.Arrays;
import java.util.Stack;

public class FindPath {
    public static  int[] findPath(int[][] graph, int s, int t) {
        int[] parent = new int[graph.length];
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);
        visited[s] = true;
        while (!stack.isEmpty()) {
            int u = stack.pop();
            for (int v = 0; v <= t; v++) {
                if (graph[u][v] == 1 && !visited[v]) {
                    stack.push(v);
                    visited[v] = true;
                    parent[v] = 1;
                }
            }
        }

        return parent;
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 1, 0},
                {1, 0, 0, 0},
                {1, 0, 0, 0},
                {0, 0, 0, 0},
      };
            System.out.println(Arrays.toString(findPath(graph, 0, 1)));
    }
}
