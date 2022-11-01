package recursion;

/**
 *  Bài 5 : Tính tổ hợp chập K của N = (tổ hợp chập k của n - 1) + (tổ hợp chập k - 1 của n - 1)
 */
public class BT5 {
    public static int toHopChapK(int K, int N) {
        if (K == N || K == 0) return 1;
        return toHopChapK(K, N - 1) + toHopChapK(K - 1, N - 1);
    }

    public static void main(String[] args) {
        System.out.println(toHopChapK(2, 3));
    }
}