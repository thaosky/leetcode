
import java.lang.Math;

class Solution {
    public static void main(String[] args) {
        countPrimes(2);
    }

    static int countPrimes(int n) {
        int result = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0 && num != i) {
                return false;
            }
        }
        System.out.println(num);
        return true;
    }
}