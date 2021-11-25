import java.io.FileOutputStream;
import java.util.Arrays;

public class _88_Merge_Sorted_Array_2 {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {0,2, 6};


        System.out.println(Arrays.toString(merge(n1, 5, n2, 3)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
       for (int a: nums2) {

          chenPhanTu(a, nums1, m);
           m++;
        };
       return nums1;
    }

    private static void chenPhanTu(int a, int[] nums1, int m) {
        boolean timDUoc = false;
        for (int i = 0; i < m ; i++) {
            if (a < nums1[i]) {
                timDUoc = true;
                for (int j = m; j > i ; j--) {
                    nums1[j]= nums1[j-1];
                }
                nums1[i] = a;
                break;
            }
            if (!timDUoc) {
                nums1[m] = a;
            }
        }
    }

//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int counter1 = m-1, counter2 = n-1, counter3 = m+n-1;
//        while (counter1>=0 && counter2>=0) {
//            if (nums1[counter1] > nums2[counter2]) {
//                nums1[counter3] = nums1[counter1];
//                counter1--;
//            } else {
//                nums1[counter3] = nums2[counter2];
//                counter2--;
//            }
//            counter3--;
//        }
//        while (counter2>=0) {
//            nums1[counter3] = nums2[counter2];
//            counter3--;
//            counter2--;
//        }
//    }


}
