//package graph;
//
//import java.util.*;
//
//public class FindPath {
//    public static void findPath(int[][] graph, int s, int t) {
//        int[] parent = new int[graph.length];
//        boolean[] visited = new boolean[graph.length];
//        dfs(s, visited, parent, graph);
//        if (!visited[t]) {
//            System.out.println("Không có đường đi");
//        } else {
//            // Truy vết đường đi
//            List<Integer> path = new ArrayList<>();
//            // Bắt đầu từ đỉnh kết thúc truy vết lại
//            while (t != s) {
//                path.add(t);
//                t = parent[t];
//            }
//            path.add(s);
//            Collections.reverse(path);
//            System.out.println(path);
//        }
//    }
//
//    public static int[] dfs(int u, boolean[] visited, int[] parent, int[][] adj) {
//        visited[u] = true;
//        for (int v : adj[u]) {
//            if (!visited[v]) {
//                parent[v] = u;
//                dfs(v, visited, parent, adj);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] graph = {
//                {0, 1, 1, 0},
//                {1, 0, 0, 0},
//                {1, 0, 0, 0},
//                {0, 0, 0, 0},
//        };
//        findPath(graph, 0, 1);
//    }
//}
