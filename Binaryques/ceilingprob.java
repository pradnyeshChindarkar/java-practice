public class ceilingprob {

    // In an array, the target element has to be present if not then greater than
    // target
    // Example:
    // array = [29,11,20,99]
    // target = 11
    // output = 11

    // target = 19
    // output = 20
    // (As 99 is also greater but it has to only get the next bigger number)
    // Note: If array is sorted.

    public static void main(String[] args) {
        int arr[] = { -34, -12, -2, 38, 78, 90, 100 };
        int target = 33;

        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

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
        return start;
    }
}
