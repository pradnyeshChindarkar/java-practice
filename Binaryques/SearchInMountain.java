public class SearchInMountain {
    public static void main(String[] args) {
        // [1,2,3,5,4,3,1]
        int arr[] = { 1 };
        int target = 0;

        int res= findAns(arr, target);
        System.out.println(res);


    }

    static int findAns(int arr[], int target) {
        int peakidx = peakIndexInMountainArray(arr);
        int left = search(arr, target, 0, peakidx);
        if (left != -1) {
            return left;
        }
        return search(arr, target, peakidx + 1, arr.length - 1);

    }

    static int search(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = (start + end) / 2;

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

        }

        return -1;
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
