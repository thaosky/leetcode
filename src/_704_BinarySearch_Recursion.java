public class _704_BinarySearch_Recursion {
    public static void main(String[] args) {
        int[] a = {-1, 0, 3, 5, 9, 12};
        System.out.println(binarySearch(a, 9));
    }

    public static int binarySearch(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length);
    }

    public static int binarySearch(int[] nums, int target, int iLeft, int iRight) {
        int iMid = (iLeft + iRight) / 2;
        //BT cơ sở
        if (iLeft > iRight) return -1;
        if (target == nums[iMid]) {
            return iMid;
        } else if (target > nums[iMid]) {
            return binarySearch(nums, target, iMid + 1, iRight);
        } else {
            return binarySearch(nums, target, iLeft, iMid - 1);
        }

    }
}
