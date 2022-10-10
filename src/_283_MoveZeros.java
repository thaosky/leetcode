public class _283_MoveZeros {
    public void moveZeroes(int[] nums) {
        int currentIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentIdx] = nums[i];
                currentIdx++;
            }
        }

        for (int i = currentIdx + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {

    }
}
