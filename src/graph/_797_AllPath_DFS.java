package graph;

import java.util.ArrayList;
import java.util.List;

public class _797_AllPath_DFS {
    /**
     * @param adj danh sách kề
     * @return Các đường đi từ đỉnh 0 -> đỉnh n
     */
    public static List<List<Integer>> allPathsSourceTarget(int[][] adj) {
        List<List<Integer>> allPaths = new ArrayList<>(); //
        List<Integer> path = new ArrayList<>();

        path.add(0);
        dfsSearch(adj, 0, allPaths, path);

        return allPaths;
    }

    private static void dfsSearch(int[][] graph, int node, List<List<Integer>> allPaths, List<Integer> path) {
        if (node == graph.length - 1) {
            allPaths.add(new ArrayList<>(path));
            return;
        }

        for (int nextNode : graph[node]) {
            path.add(nextNode);
            dfsSearch(graph, nextNode, allPaths, path);

            // Remove phần tử cuối cùng
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        System.out.println(allPathsSourceTarget(graph));
    }
}
