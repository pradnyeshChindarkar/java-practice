package SortingAlgo;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int arr[] = { 8, 6, 4, 2, 3, 5, 7, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int arr[]) {
        // **** We cannot use forloop because we need to move the index(i) ahead only ****
        // **** if the element at i is placed at the correct index, so we don't have a control over the index(i) in for loop. ****
        // **** So we will use a while loop and iterate the index(i) only when element at index(i) is placed correct. i.e index(0) = 0 ****

        // for (int i = 0; i < arr.length; i++) {
        //     int correct = arr[i]-1;
        //     if (arr[i] != arr[correct]) {
        //         swap(arr, i, correct);
        //         // System.out.println("curr elem: "+arr[i]);
        //         // System.out.println("Element at wrong pos: "+arr[arr[i]-1]);
        //     }
        // }

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int arr[], int idx, int elem) {
        int temp = arr[idx];
        arr[idx] = arr[elem];
        arr[elem] = temp;
    }
}
