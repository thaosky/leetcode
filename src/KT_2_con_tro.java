/**
 * Con trỏ thứ nhất - i đơn giản là duyệt từ đầu đến cuối mảng để tìm phần tử "ĐÚNG"
 * Con trỏ thứ 2 - k: Luôn là phần tử đúng cuối cùng, chỉ nhảy khi có phần tử đúng
 */
public class KT_2_con_tro {

    // Áp dụng cho bài 27 - Remove Element
    private static int removeElement(int[] nums, int x) {
        int k = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] == x) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    // Áp dụng cho bài 88 - Merge sorted array
    // https://vnoi.info/wiki/algo/basic/two-pointers.md
    private static void insertElementToArr(int x, int[] nums1, int m) {

    }

}
