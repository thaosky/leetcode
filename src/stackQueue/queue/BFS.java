package stackQueue.queue;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/*
 *  B1: Add đỉnh đầu vào queue, đánh dấu đã thăm
 *  B2: Khi trong queue còn element
 *      - poll(u), xử lý j đó với u, tùy thuộc bài toán
 *      - tìm các đỉnh v kề với u, và chưa được duyệt => cho v vào queue, đánh dấu đã duyệt
 *
 */
public class BFS {
    public static void main(String[] args) {
        int[][] graph = {
                {0, 1, 0, 0, 0, 0, 0},
                {1, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 1, 0, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 0, 0}};

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        Set<Integer> visited = new HashSet<>();
        visited.add(0);

        while (!queue.isEmpty()) {
            int u = queue.poll();
            System.out.println("Thăm đỉnh " + u);
            for (int v = 0; v < graph.length; v++) {
                if (graph[u][v] == 1 && !visited.contains(v)) {
                    queue.add(v);
                    visited.add(v);
                }
            }
        }
    }
}
