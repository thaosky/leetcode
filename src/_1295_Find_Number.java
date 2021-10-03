public class _1295_Find_Number {
    public static void main(String[] args) {
        int[] nums = {1, 22, 3, 4};

        System.out.println(findNumber(nums));
    }

    // Đếm số lượng số có số chữ số là chẵn trong mảng
    public static int findNumber(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (countNum(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Đếm số chữ số của 1 số = số lần chia 10 được kết quả > 0
    private static int countNum(int num) {
        int count = 0;
        int resultByDivide10 = num;
        while (resultByDivide10 > 0) {
            count++;
            resultByDivide10 = num / 10;
            num = resultByDivide10;
        }
        return count;
    }
}
