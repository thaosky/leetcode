package graph;


public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int row, int column, int color) {
        // màu cũ trùng màu mới =>  không cần làm j
        if (image[row][column] == color) return image;

        DFS(image, row, column, color, image[row][column]);
        return image;
    }

    /**
     *
     * @param image ma trận
     * @param row chỉ số hàng của ô cần fill màu
     * @param column chỉ số cột của ô cần fill màu
     * @param newColor màu cần fill mới
     * @param originColor màu hiện tại
     */
    public void DFS(int[][] image, int row, int column, int newColor, int originColor) {
        // nếu chỉ số hàng, cột không thỏa mãn
        if (row < 0 || row >= image.length || column < 0 || column >= image[0].length) {
            return;
        }

        /*
            Đệ quy fill 4 ô xung quanh, trường hợp ô cùng màu vs màu gốc => đổi sang màu mới
            else giữ nguyên màu cũ
         */

        if (originColor != image[row][column]) {
            return;
        }

        // fill màu
        image[row][column] = newColor;

        // Thực hiện đệ quy fill màu cho 4 ô xung quanh
        DFS(image, row - 1, column, newColor, originColor);
        DFS(image, row + 1, column, newColor, originColor);
        DFS(image, row, column - 1, newColor, originColor);
        DFS(image, row, column + 1, newColor, originColor);
    }

    public int[][] floodFillBFS(int[][] image, int row, int column, int color) {
        // TODO
        return image;
    }
}
