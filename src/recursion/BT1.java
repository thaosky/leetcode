package recursion;

/**
 *   Tính tổng S(n) = 1 + 2 + 3 + 4 + .. + n bằng đệ quy
 */
public class BT1 {
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n-1) ;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
