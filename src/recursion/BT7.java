package recursion;

/**
 * BT7: Tìm a ^ b bằng lũy thừa nhị phân
 */
public class BT7 {
    public static int pow(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return pow(a, b / 2) * pow(a, b / 2);
        return pow(a, b / 2) * pow(a, b / 2) * a;
    }

    public static int pow2(int a, int b) {
        if (b == 0) return 1;
        int temp = pow(a, b / 2);
        if (b % 2 == 0) return temp * temp;
        return temp * temp * a;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(pow2(2, 3));
    }
}
