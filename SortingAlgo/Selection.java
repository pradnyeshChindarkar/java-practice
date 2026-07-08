package SortingAlgo;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int arr[] = { 3, 5, -2, 7, 8, -1, 0 };

        answer(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void answer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int getMax = getMaxIndex(arr, last);
            swap(arr, getMax, last);
        }
    }

    static void swap(int arr[], int maxEl, int lastEl) {
        int temp = arr[lastEl];
        arr[lastEl] = arr[maxEl];
        arr[maxEl] = temp;

    }

    static int getMaxIndex(int[] arr, int last) {
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
