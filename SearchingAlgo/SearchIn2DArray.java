
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 20, 11 },
                { 2823, 391, 19 },
                { 1190, -3 }
        };

        int target = 119;
        System.out.println(Arrays.toString(searchElement(arr, target)));
        System.out.println("Maximum number: "+max(arr));
        System.out.println("Minimum number: "+min(arr));


    }

    static int[] searchElement(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found in " + i + " row and column " + j);
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }

        return max;
    }


    static int min(int[][] arr){
        int min = arr[0][0];
        for(int i[]:arr){
            for (int ele : i) {
                if (min > ele) {
                    min = ele;
                }
            }
        }
        return min;
    }
}
