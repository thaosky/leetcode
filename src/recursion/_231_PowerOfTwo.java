package recursion;

public class _231_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        while (n != 0) {
            if (n == 1) {
                return true;
            }
            if (n % 2 == 1) {
                return false;
            }
            n = n/2;
        }
        return false;
    }

    public static boolean isPowerOfTwoRecursion(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1 || n == 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(5));

        System.out.println(isPowerOfTwoRecursion(0));
        System.out.println(isPowerOfTwoRecursion(3));
        System.out.println(isPowerOfTwoRecursion(16));
        System.out.println(isPowerOfTwoRecursion(5));
    }
}
