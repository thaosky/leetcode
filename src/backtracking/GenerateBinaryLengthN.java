package backtracking;

import java.util.Arrays;

/**
 * Liệt kê các xâu nhị phân có độ dài N
 * VD n = 3: 000, 001, 010, 011....
 * => Quay lui xâu nhị phân có độ dài N
 */
public class GenerateBinaryLengthN {
    static int N = 2;

    static int[] cauHinh = new int[N + 1];

    static void inCauHinh(int[] x) {
        System.out.println(Arrays.toString(x));
    }

    static void Try(int i) {
        for (int j = 0; j <= 1; j++) {
            cauHinh[i] = j;
            if (i == N)
                inCauHinh(cauHinh);
            else
                Try(i + 1);
        }
    }

    public static void main(String[] args) {
        Try(0);
    }
}
