public class _704_BinarySearch_Loop {
    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch(a, 9));
    }

    public static int binarySearch(int[] nums, int target) {
        int iLeft = 0;
        int iRight = nums.length - 1;
        while (iLeft < iRight) {
            int iMid = (iLeft + iRight) / 2;
            if (nums[iMid] == target) return iMid;
            else if (nums[iMid] > target) {
                iRight = iMid - 1;
            } else {
                iLeft = iMid + 1;
            }
        }

        return -1;
    }
}
