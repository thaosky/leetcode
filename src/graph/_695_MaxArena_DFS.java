package graph;

import java.awt.*;
import java.util.Stack;

public class _695_MaxArena_DFS {
    public static int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        Stack<Point> stack = new Stack<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    stack.push(new Point(i, j));
                    int area = getArea(grid, stack);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }
        return maxArea;
    }

    public static int getArea(int[][] grid, Stack<Point> stack) {
        int area = 0;
        while (!stack.isEmpty()) {
            Point point = stack.pop();
            if (point.x < 0 || point.y < 0 || point.x > grid.length - 1 || point.y > grid[0].length - 1) continue;
            if (grid[point.x][point.y] == 0) continue;
            if (grid[point.x][point.y] == 1) {
                area++;
            }
            grid[point.x][point.y] = 0;
            stack.push(new Point(point.x + 1, point.y));
            stack.push(new Point(point.x - 1, point.y));
            stack.push(new Point(point.x, point.y + 1));
            stack.push(new Point(point.x, point.y - 1));
        }
        return area;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}};

        System.out.println(maxAreaOfIsland(grid));
    }
}
