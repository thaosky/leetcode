package graph;

import java.util.*;

public class _1971_FindIfPathExist_DFS_BFS {
    /**
     * @param n đỉnh 0 -> n-1
     * @param edges danh sách kề
     * @return có đường đi từ s -> t không
     */

    // Dùng DFS
    public boolean validPath(int n, int[][] edges, int s, int t) {
        if (s == t) return true;
        // Chuyển từ danh sách cạnh sang danh sách kề
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }

        // DFS để đi thăm tất cả các đỉnh từ đỉnh s
        boolean[] visited = new boolean[n];
        visited[s] = true;
        Stack<Integer> stack = new Stack<>();
        stack.add(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (u == t) {
                return true;
            }
            for (int v : graph.get(u)) {
                if (!visited[v]) {
                    stack.add(v);
                    visited[v] = true;
                }
            }
        }
        return false;
    }
    public boolean validPathBFS(int n, int[][] edges, int s, int t) {
        // Chuyển từ danh sách cạnh sang danh sách kề
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }

        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.add(s);
        visited[s] = true;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            if (t == u) return true;
            for (int edge: graph.get(u)) {
                if (!visited[edge]) {
                    queue.add(edge);
                    visited[edge] = true;
                }
            }
        }
        return false;
    }
}
