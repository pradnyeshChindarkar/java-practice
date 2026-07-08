public class RotatedArray {
    public static void main(String[] args) {
        int arr[] = {5,1,2};
        int target = 5;
        System.out.println(ans(arr, target));
    }

    static int ans(int arr[], int target) {
        int pivot = searchPivot(arr);

        if (search(arr, target, 0, pivot) != -1) {
            return search(arr, target, 0, pivot);
        }
        return search(arr, target, pivot + 1, arr.length - 1);
    }

    static int searchPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }


        }
        return -1;
    }

    static int search(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        System.out.println("In search");
        return -1;
    }
}
