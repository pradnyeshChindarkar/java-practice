public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {32,239,110,2120,3499,4};
        int target = 321;

        System.out.println(searchInRange(arr, target, 1, 4));;
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
