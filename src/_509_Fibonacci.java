import java.util.Arrays;

public class _509_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib2(6));
    }

    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if(n <= 1) return n;
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
        return arr[n];
    }

}
