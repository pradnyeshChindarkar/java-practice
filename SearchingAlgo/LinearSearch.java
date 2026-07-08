import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 43, 4231, 59, 42 };
        Scanner in = new Scanner(System.in);

        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the target value: ");
        int target = in.nextInt();

        // System.out.println("Index is: "+returnIndex(arr, target));
        returnValue(arr, target);
        in.close();

    }

    static int returnIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static void returnValue(int[] arr, int target) {
        try {
            System.out.println(arr[target]);
        } catch (Exception ArrayIndexOutOfBoundsException) {
            System.out.println("Tip: Targeted index must be greater than size of a list.");
        }

    }

}
