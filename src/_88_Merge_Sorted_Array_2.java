public class _88_Merge_Sorted_Array_2 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {0,2, 6};

        merge(n1, 5, n2, 3);
        System.out.println("DONE");
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int counter1 = m-1, counter2 = n-1, counter3 = m+n-1;
        while (counter1>=0 && counter2>=0) {
            if (nums1[counter1] > nums2[counter2]) {
                nums1[counter3] = nums1[counter1];
                counter1--;
            } else {
                nums1[counter3] = nums2[counter2];
                counter2--;
            }
            counter3--;
        }
        while (counter2>=0) {
            nums1[counter3] = nums2[counter2];
            counter3--;
            counter2--;
        }
    }


}
