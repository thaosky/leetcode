import java.util.Arrays;

public class _902_SortArray_MergeSort {


    // Merge hai mảng con của arr[].
    // Mảng con thứ nhất là arr[l..m]
    // Mảng con thứ hai là arr[m+1..r]
    static void merge(int arr[], int l, int m, int r) {

        // Tìm kích thước của 2 mảng con để merged
        int lSize = m - l + 1;
        int rSize = r - m;

        // Tạo mảng tạm
        int L[] = new int[lSize];
        int R[] = new int[rSize];

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < lSize; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < rSize; ++j)
            R[j] = arr[m + 1 + j];

        // Merge các mảng tạm lại
        // TODO
    }

    static void sort(int arr[], int l, int r) {
        if (l >= r) return;

        // Tìm điểm chính giữa
        int m = (l + r) / 2;

        // Hàm đệ quy tiếp tục chia đôi
        sort(arr, l, m);
        sort(arr, m + 1, r);

        merge(arr, l, m, r);
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {25, 30, 45, 6, 11, 90, 15};

        System.out.println("Mảng ban đầu:");
        printArray(arr);
        sort(arr, 0, arr.length - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}
