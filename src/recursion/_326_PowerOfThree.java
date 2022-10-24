package recursion;

public class _326_PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        while (n != 0){
            if (n == 1) {
                return true;
            }
            if (n % 3 != 0) {
                return false;
            }
            n = n/3;
        }
        return false;
    }
    public static boolean isPowerOfThreeRecursion(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n/3);
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfThreeRecursion(27));
    }
}
