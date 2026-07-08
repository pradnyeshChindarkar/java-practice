import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        reverse(arr);
        in.close();
        System.out.println(Arrays.toString(arr));
    }

    // [32, 21, 3, 13, 39]

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start < end) {

            swap(arr, start, end);

            start++;
            end--;
            System.out.println(start);
            System.out.println(end);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
