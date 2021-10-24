public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 5, 4};
        int val = 2;
        System.out.println(removeElement2(arr, val));
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;

        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static int removeElement2(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }


}
