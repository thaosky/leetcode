package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Convert_Edges_Adj {
    /**
     * @param edges danh sách cạnh edges = {{1, 2}, {1, 3}, {2, 4}}
     * @return danh sách kề adj = {{1: 2, 3}, {2: 1, 4}, {3: 1}, {4: 2}}
     */
    static Map<Integer, List<Integer>> convert(int[][] edges) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            // computeIfAbsent: value == null? update value : giữ nguyên. Return value
            /*
             ---> Khi value null, tạo new array list X return X. add thêm phần tử vào X
             ---> Value != null, vẫn giữ nguyên array list X, return X, add thêm phần tử vào X
             */
            adj.computeIfAbsent(a, v -> new ArrayList<>()).add(b);
            adj.computeIfAbsent(b, v -> new ArrayList<>()).add(a);
        }
        return adj;
    }

    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {1, 3}, {2, 4}};
        int[][] edges2 = {{4,3},{1,4},{4,8},{1,7},{6,4},{4,2},{7,4},{4,0},{0,9},{5,4}};
        System.out.println(convert(edges));
        System.out.println(convert(edges2));
    }
}
