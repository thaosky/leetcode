package stackQueue.stack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/*
 * B1: Add đỉnh đầu vào stack và đánh dấu đã duyệt đỉnh đầu
 * B2: while(!stack.isEmpty()) {
         *      u = stack.pop();
         *      process(u) tùy thuộc từng bài toán
         *      Add tất cả đỉnh v kề với u vào stack ( v chưa được duyệt)
         *      Đánh dấu đã duyệt v
 * }
 */
public class DFS {

    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}};

        // B1: Add đỉnh đầu là đỉnh 0 vào stack, đánh dấu đã duyệt
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        // Duyệt stack
        while (!stack.isEmpty()) {
            int u = stack.pop();
            System.out.println("Thăm đỉnh " + u);

            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && !visited.contains(v)) {
                    stack.push(v);
                    visited.add(v);
                }
            }

        }
    }
}
