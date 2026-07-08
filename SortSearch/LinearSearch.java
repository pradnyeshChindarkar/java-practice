package SortSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 23, 13, 55, 21, 1 };
        int target = 55;
        System.out.println("By Linear Search,");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        System.out.println("By Binary Search,");
        int arr2[] = { 1, 2, 34, 35, 55 };
        int targetB = 55;
        int start = 0;
        int end = arr2.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr2[mid] == targetB) {
                System.out.println("Element found at index: " + mid);
                return;
            }

            if (targetB < arr2[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
}
