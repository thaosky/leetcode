package backtracking;

import java.util.Arrays;

/**
 * Liệt kê các xâu nhị phân có độ dài N
 * VD n = 3: 000, 001, 010, 011....
 * => Quay lui xâu nhị phân có độ dài N
 */
public class GenerateBinaryLengthN {
    static int N = 3;
    static int[] X = new int[4];

    //
    static void solution(int i) {
        for (int j = 0; j <= 1; j++) { //Bit chỉ gồm 2 giá trị 0 và 1
            X[i] = j;
            if (i == N) {
                System.out.println(Arrays.toString(X));
            } else {
                solution(i + 1);
            }
        }
    }

    public static void main(String[] args) {
        solution(0);
    }
}
