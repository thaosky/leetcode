package graph;

import java.util.ArrayList;
import java.util.List;

public class _1791_CenterStar {
    /*
        Cho 1 đồ thị sao bao gồm n đỉnh
     */
    public static int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
