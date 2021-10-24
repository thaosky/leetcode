public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4, 5, 0, 0, 0};
        int[] n2 = {3, 0, 6};

        merge(n1, 5, n2, 3);
        System.out.println("DONE");
    }

    /**
     * m - size của các element có thật trong nums1
     * VD: [1,2,3,0,0,0,0] => m = 3
     * n - length nums2
     */

    // Thay vì merge 2 mảng vào nhau, chèn lần lượt phần tử mảng 2 vào mảng 1
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // duyệt qua từng phần tử mảng 2 để chèn vào, do ko cần sd index nên dùng for each
        for (int x : nums2) {
            insertElementToArr(x, nums1, m);
            m++;
        }
    }

    /**
     * hàm chèn nhận vào 3 tham số:
     * x : phần tử cần chèn vào
     * nums1: mảng mà phần tử x sẽ chèn vào
     * m: số phần tử có trong mảng nums1, sau khi chèn 1 phần tử m = m + 1
     */

    private static void insertElementToArr(int x, int[] nums1, int m) {
        boolean timDuocK = false;
        for (int k = 0; k < m; k++) {
            // nếu x > nums1[k] => chèn vào sau k
            if (x < nums1[k]) {
                timDuocK = true;
                for (int i = m - 1; i >= k; i--) {
                    nums1[i + 1] = nums1[i];
                }
                nums1[k] = x;
                break;
            }
        }

        if (!timDuocK) {
            nums1[m] = x;
        }
    }


}
