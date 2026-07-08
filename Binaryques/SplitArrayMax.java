public class SplitArrayMax {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 4, 2, 3 };

        System.out.println(splitt(arr, 2));
    }

    static int splitt(int arr[], int m) {
        int start = 0;
        int end = 0;

        for (int i : arr) {
            start = Math.max(start, i);
            end += i;
        }
        // System.out.println(end);

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int splits = 1;

            for (int num : arr) {
                if (sum + num > mid) {
                    sum = num;
                    splits++;
                } else {
                    sum += num;
                }
            }

            if (splits > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}
