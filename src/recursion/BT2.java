package recursion;

/**
 *  BT2: Tính tổng S(n) = 1 + 1 / 2 + 1 / 3 + … + 1 / n
 */
public class BT2 {
    public static int sum(int n) {
        if (n == 1) return 1;
        return 1/n + sum(n-1) ;
    }

    public static void main(String[] args) {
        System.out.println(sum(3));
    }
}
