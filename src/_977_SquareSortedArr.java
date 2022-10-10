import java.util.Arrays;

public class _977_SquareSortedArr {
    public static void main(String[] args) {
        int[] arr = {-2,-1,0,5,7};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }

    /**
     * 2 pointer
     */
    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int iLeft = 0;
        int iRight = nums.length - 1;
        for (int i = nums.length - 1; i >= 0 ; i--) {
            if (nums[iLeft]* nums[iLeft] > nums[iRight]* nums[iRight]) {
                result[i] = nums[iLeft]*nums[iLeft];
                iLeft++;
            } else {
                result[i] = nums[iRight]*nums[iRight];
                iRight--;
            }
        }
        return result;
    }
}
