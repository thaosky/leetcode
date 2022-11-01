package recursion;

/**
 *  Bài 3 : Tính giai thừa bằng đệ quy
 */
public class BT3 {
    public static int giaiThua(int n) {
        if (n == 0) return 1;
        return n * giaiThua(n-1) ;
    }

    public static void main(String[] args) {
        System.out.println(giaiThua(3));
    }
}
