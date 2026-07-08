package SortSearch;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int arr[] = { 92, 21, 3, 4, 66, 32 };
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] < arr[j + gap]) {
                        break; // already sorted
                    } else {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
