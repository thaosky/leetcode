package sort;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {11, 5, 7, 2, 3, 6, 9, 32, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
