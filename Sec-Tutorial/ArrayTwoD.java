import java.util.Arrays;
import java.util.Scanner;

public class ArrayTwoD {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 22;
        arr[1][1] = 293;
        arr[1][2] = 449;
        arr[0][2] = 872;

        System.out.println(arr[0].length);
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        in.close();

        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }

    }
}
