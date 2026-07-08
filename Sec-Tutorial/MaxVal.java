import java.util.*;

public class MaxVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(max(arr));
    }
    // [327, 92, 1119, 21]

    static int max(int[] arr) {
        int maxnum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxnum){
                maxnum = arr[i];
            }
        }
        return maxnum;
    }
    
}
