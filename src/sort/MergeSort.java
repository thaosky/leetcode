package sort;

import java.util.Arrays;

public class MergeSort {

    static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (right + left) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {
        // 1. Chia array làm đôi
        int n1 = mid - left + 1;
        int n2 = right - mid; // r - (m + 1) + 1 = r - m

        // 1.1 Tạo mảng tạm
        int[] L = new int[n1];
        int[] R = new int[n2];

        // 1.2 Copy vào 2 mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // 2. Merge
        int i = 0;
        int j = 0;

        int k = left;
        // Dùng kĩ thuật 2 con trỏ, con trỏ k luôn lưu phần tử đúng
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
//        int[] arr = {11, 5, 7, 2, 3, 6, 9, 32, 2};
//        sort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(arr));

        int[] a = {5, 1, 3, 2};
        sort(a, 0, a.length - 1);
    }

}
