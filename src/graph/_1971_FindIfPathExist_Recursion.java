package graph;

import java.util.*;

public class _1971_FindIfPathExist_Recursion {
    /**
     * @param n     đỉnh 0 -> n-1
     * @param edges danh sách kề
     * @return có đường đi từ s -> t không
     */

    // Dùng DFS
    public boolean validPath(int n, int[][] edges, int s, int t) {
        if (s == t) return true;
        HashMap<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            adj.computeIfAbsent(a, val -> new ArrayList<>()).add(b);
            adj.computeIfAbsent(b, val -> new ArrayList<>()).add(a);
        }
        boolean[] visited = new boolean[n];
        return dfs(visited, adj, s, t);
    }

    public boolean dfs(boolean[] visited, HashMap<Integer, List<Integer>> adj, int s, int t) {
        if (s == t) return true;
        if (!visited[s]) {
            visited[s] = true;
            for (int nextNode : adj.get(s)) {
                if (dfs(visited, adj, nextNode, t))
                    return true;
            }
        }
        return false;
    }
}
