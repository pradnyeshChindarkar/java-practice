public class Binsearch {
    public static void main(String[] args) {
        int arr[] = { 920, 99, 21, 19, 3 };
        int target = 99;

        int answer = search(arr, target);
        System.out.println(answer);
    }

    static int search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
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

}