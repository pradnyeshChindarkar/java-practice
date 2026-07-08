import java.util.Arrays;

public class Matrices2D {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(search(arr, 4)));
    }

    static int[] search(int[][] arr, int target) {

        int row = 0;
        int col = arr.length - 1;
        int cEnd = arr.length - 1;
        while (row < arr.length && col >= 0) {
            int cStart = 0;
            int midr = (row + col) / 2;
            if (target == arr[midr][cEnd]) {
                System.out.println(midr);
                return new int[] { midr, cEnd };
            }
            if (target > arr[midr][cEnd]) {
                row = midr + 1;
            }
            if (target < arr[midr][cStart]) {
                col = midr - 1;
            } else {
                cEnd--;
            }

        }
        return new int[] { -1, -1 };
    }
}
