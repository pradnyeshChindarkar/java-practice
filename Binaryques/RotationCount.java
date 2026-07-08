public class RotationCount {
    public static void main(String[] args) {
        // Initial Array -> [3,4,5,18,19]
        int arr[] = {3,4};
        System.out.println(getCount(arr));
    }

    static int getCount(int arr[]) {
        int pivot = searchPivot(arr);
        System.out.println(pivot);
        return pivot + 1;
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
}
