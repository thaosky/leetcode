public class _1295_Find_Number {
    public static void main(String[] args) {
        int[] nums = {1, 22, 3, 4, 12};

        // System.out.println(findNumber(nums));
        System.out.println(isEvenNumberOfDigits(20));
        System.out.println(isEvenNumberOfDigits(2));
        System.out.println(countEvenNumberOfDigits(nums));
    }

    /**
     * 21/11
     */
    public static boolean isEvenNumberOfDigits(int number) {
        int count = 1;
        number = number / 10;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count % 2 == 0;
    }

    public static int countEvenNumberOfDigits(int[] numbers) {
        int count = 0;
        for (int num: numbers) {
            if (isEvenNumberOfDigits(num)) {
                count++;
            }
        }
        return count;
    }


    /**
     * Đã từ rất lâu
     */
//    // Đếm số lượng số có số chữ số là chẵn trong mảng
//    public static int findNumber(int[] arr) {
//        int count = 0;
//        for (int i : arr) {
//            if (countNum1(i) % 2 == 0) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    // Đếm số chữ số của 1 số = số lần chia 10 được kết quả > 0
//    private static int countNum(int num) {
//        int count = 0;
//        int resultByDivide10 = num;
//        while (resultByDivide10 > 0) {
//            count++;
//            resultByDivide10 = num / 10;
//            num = resultByDivide10;
//        }
//        return count;
//    }
//
//    private static int countNum1(int num) {
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num = num / 10;
//        }
//        return count;
//    }
}
