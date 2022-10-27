package graph;

import java.awt.*;
import java.util.Arrays;
import java.util.Stack;

public class _200_NumberOfIsland_DFS {
    private static int numsStack = 0;

    static void dfs(char[][] grid, int x, int y) {
        Stack<Point> stack = new Stack<>();
        numsStack++;
        stack.push(new Point(x, y));
        while (!stack.isEmpty()) {
            Point point = stack.pop();
            if (point.x < 0 || point.y < 0 || point.x > grid.length - 1 || point.y > grid[0].length - 1 || grid[point.x][point.y] == '0')
                continue;
            grid[point.x][point.y] = '0';

            stack.push(new Point(point.x + 1, point.y));
            stack.push(new Point(point.x - 1, point.y));
            stack.push(new Point(point.x, point.y + 1));
            stack.push(new Point(point.x, point.y - 1));
        }
    }

    public static int numIslands(char[][] grid) {
        int count = 0;

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == '1') {
                    count++;
                    dfs(grid, x, y);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char[][] graph = {{'1'}, {'1'}};
        System.out.println(numIslands(graph));
        System.out.println(Arrays.deepToString(graph));
        System.out.println("Số stack đã tạo "+ numsStack);
    }
}
