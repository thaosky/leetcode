package graph;

import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _200_NumberOfIsland_BFS {

    /**
     *
     * @param grid matrix được đánh 0 - nước, 1 - đất.
     * @param m chỉ số hàng điểm đang xét
     * @param n chỉ số cột điểm đang xét
     */
    static void bfs(char[][] grid, int m, int n) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(m, n));

        while (!queue.isEmpty()) {
            Point p = queue.poll(); // lần lượt lấy ra element trong queue

            if ((p.x < 0 || p.x >= grid.length || p.y < 0 || p.y >= grid[0].length)) continue;
            if (grid[p.x][p.y] == '0') continue; // Là nước or đã thăm

            grid[p.x][p.y] = '0'; // đánh dấu đã thăm

            // add 4 điểm xung quanh điểm đang xét vào queue
            queue.add(new Point(p.x - 1, p.y));
            queue.add(new Point(p.x + 1, p.y));
            queue.add(new Point(p.x, p.y - 1));
            queue.add(new Point(p.x, p.y + 1));
        }
    }

    /**
     * @param grid matrix được đánh 0 - nước, 1 - đất.
     * @return Số thành phần liên thông (số lượng đảo)
     *  duyệt qua từng element nếu là đất và chưa thăm
     *      =>  count++
     *          Từ đảo đó đi thăm các miếng đất xung quanh  BFS/DFS
     *
     *
     */
    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int m = 0; m < grid.length; m++) {
            for (int n = 0; n < grid[m].length; n++) {
                if (grid[m][n] == '1') {
                    count++;
                    bfs(grid, m, n);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] graph = {{'1'}, {'1'}};
        System.out.println(numIslands(graph));
        System.out.println(Arrays.deepToString(graph));
    }
}
