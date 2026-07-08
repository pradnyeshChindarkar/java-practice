public class InfiniteArray {

    // Question: Find position of an element in a sorted array of infinite numbers.

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 11;

        System.out.println(findingAns(arr, target));
    }

    static int findingAns(int arr[], int target) {

        // Finds the range the target will lie in.

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            // Doubling the size
            // (end - start + 1) -> Size of an array
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, start, end, target);
    }

    static int binarySearch(int arr[], int start, int end, int target) {

        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}
