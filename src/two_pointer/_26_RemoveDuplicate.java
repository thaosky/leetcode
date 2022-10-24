package two_pointer;

import java.util.Arrays;

public class _26_RemoveDuplicate {
    // Cho 1 array sắp xếp tăng dần, loại bỏ các phần tử trùng
    // Mỗi phần tử chỉ xuất hiện 1 lần
    public static int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }
}
