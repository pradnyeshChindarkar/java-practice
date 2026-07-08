package SortSearch;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 81, 1, 44, 4, 12, 9, 5, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = getMinIndex(arr, i);
            if (arr[i] > arr[minIdx]) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    static int getMinIndex(int arr[], int id) {
        int minValue = arr[id];
        int minIdx = id;
        for (int i = id; i < arr.length - 1; i++) {
            if (minValue > arr[i + 1]) {
                minValue = arr[i + 1];
                minIdx = i + 1;
            }
        }
        return minIdx;
    }
}
