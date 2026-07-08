package SortingAlgo;

// import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int arr[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(sort(arr));
        // System.out.println(Arrays.toString(arr));

    }

    static int sort(int nums[]) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != nums[nums[i]]) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] != i && arr[i] < arr.length) {
        // System.out.println(Arrays.toString(arr));
        // swap(arr, i, arr[i]);
        // System.out.println(true);
        // }
        // System.out.println(Arrays.toString(arr));
        // System.out.println("i: " + i);
        // System.out.println("elem: " + arr[i]);
        // System.out.println();
        // }
        return getMissingNum(nums);
    }

    static void swap(int arr[], int idx, int elem) {
        int temp = arr[idx];
        arr[idx] = arr[elem];
        arr[elem] = temp;
    }

    static int getMissingNum(int[] arr) {
        // int i = 0;
        // while (i < arr.length) {
        // if (arr[i] != i) {
        // return i;
        // } else {
        // i++;
        // }
        // }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return arr.length;
    }
}
