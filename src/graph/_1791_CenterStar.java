package graph;

public class _1791_CenterStar {
    /*
        Cho 1 đồ thị sao bao gồm n đỉnh
        star graph nghĩa là luôn có ! 1 đỉnh có kết nối vs tất cả các đỉnh còn lại
     */
    public static int findCenter(int[][] edges) {
        return edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1] ? edges[0][0] : edges[0][1];
    }
}
