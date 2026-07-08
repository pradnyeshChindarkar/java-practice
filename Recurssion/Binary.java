package Recurssion;

public class Binary {
    public static void main(String[] args) {
        int[] arr = { 1, 23, 66, 76, 82, 99 };
        int target = 66;
        System.out.println(searchBinary(arr, target, 0, arr.length-1));
    }

    static int searchBinary(int[] arr, int target, int start, int end) {
        int mid = (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return searchBinary(arr, target, start, mid-1);
        }

        return searchBinary(arr, target, mid+1, end);
    }
}
