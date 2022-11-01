import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1_Two_Sum {

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int length = numbers.length;

        // Tạo hash map có key là giá trị của số trong mảng
        Map<Integer, Integer> map = new HashMap<>();

        // Duyệt qua từng giá trị trong map
        for (int i = 0; i < length; i++) {
            int x = numbers[i];
            int y = target - x;

            // Nếu map đã tồn tại key
            if (map.containsKey(y)) {
                result[0] = map.get(y);
                result[1] = i;
                break;
            } else {
                map.put(x, i); // put(key, value)
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(numbers, 9)));
    }

}
