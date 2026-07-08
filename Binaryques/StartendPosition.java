// import java.util.ArrayList;

public class StartendPosition {
    public static void main(String[] args) {
        int arr[] = { 1,2,2,2,2,3,4,5,5,5,5,6,7,8,9,10,11,12,12,12,12,12,13 };
        int target = 7;

        int[] ans = searchRange(arr, target);
        for (int i : ans) {
            System.out.println(i);
        }

    }

    public static int[] searchRange(int arr[], int target) {
        int[] ans = { -1, -1 };

        int startidx = searchpos(arr, target, true);
        int endidx = searchpos(arr, target, false);

        ans[0] = startidx;
        ans[1] = endidx;
        return ans;
    }

    static int searchpos(int arr[], int target, boolean isStartIdx) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isStartIdx) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
