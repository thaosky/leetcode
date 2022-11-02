package graph;

public class SW_FindExcalibur {
    /**
     *
     * @param grid matrix MxN bao gồm
     *              . - cỏ
     *              X - đá (sau khi đi qua 3 điểm A, B, C thì bỏ qua đá)
     *              O - Điểm bắt đầu
     *              S - Điểm kết thúc
     *              A, B, C - Điểm chứa 3 mảnh thanh kiếm
     * @param x0 hoành độ điểm O
     * @param y0 tung độ điểm O
     * @return đường đi ngắn nhất từ O -> S
     */
    static int findExcalibur(char[][] grid, int x0, int y0) {
        /*
            Để đi từ  O -> S => từ O đi qua các điểm A, B, C. Từ 1 trong 3 điểm ABC đến S
            result = min(O qua ABC) + min(AS, BS, CS)
            O qua ABC có 6 trường hợp sau:
                OA + AB + BC
                OA + AC + BC
                OB + AB + AC
                OB + BC + AC
                OC + AC + AB
                OC + BC + AB
             => tìm min của 6 trường hợp trên
             => tìm min của từng cạnh OA, AB, BC, AC
             => tìm quãng đường đi ngắn nhất dùng BFS
         */

        return 0;
    }

    static int minPath(char[][] grid) {
        return 0;
    }
}
