package recursion;

/**
 *  Bài 4 : Tính số Fibonacci thứ n
 */
public class BT4 {
    public static int findFibo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return findFibo(n-1) + findFibo(n-2) ;
    }

    public static void main(String[] args) {
        System.out.println(findFibo(3));
    }
}
