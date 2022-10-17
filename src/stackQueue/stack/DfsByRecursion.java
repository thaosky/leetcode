package stackQueue.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


public class DfsByRecursion {
    public static void DFS(int u, int[][] graph, Set<Integer> visited) {
        // process u
        System.out.println("Đã thăm " + u);
        for (int v = graph.length - 1; v >= 0 ; v--) {
            if (graph[u][v] == 1 && !visited.contains(v)) {
                visited.add(v);
                DFS(v, graph, visited);
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

        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        DFS(0, graph, visited);

    }
}
