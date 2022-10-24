package palindrome;

public class _9_PalindromeNumber {
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int temp = x;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp = temp / 10;
        }
        return x == reverse;
    }

    public static boolean isPalindrome1(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        int n = chars.length;
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != chars[n - 1 - i]) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12221));
    }
}
