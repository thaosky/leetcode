package two_pointer;

import java.util.Arrays;

public class _88_Merge_Sorted_Array_2 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {0,2, 6};


        System.out.println(Arrays.toString(merge(n1, 5, n2, 3)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
       for (int a: nums2) {
           m++;
        };
       return nums1;
    }

}
