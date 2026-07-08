// import java.util.ArrayList;
import java.util.Arrays;

public class MatricesArray {
    public static void main(String[] args) {
        int arr[][] = {
                { 0, 12, 13 },
                { 1, 15, 16 },
                { 5, 20, 24 }
        };
        // System.out.println(arr[3][2]);
        // System.out.println(arr.length);
        System.out.println(Arrays.toString(search(arr, 24)));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;

        while (r < arr.length && c >= 0) {
            if (target == arr[r][c]) {
                return new int[]{r,c};
            }
            else if (target < arr[r][c]) {
                c--;
            }
            else{
                r++;
            }
        }
        return new int[] { -1, -1 };
    }
}
