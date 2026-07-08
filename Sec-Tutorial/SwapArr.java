import java.util.Scanner;
import java.util.*;

public class SwapArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[4];

        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        in.close();
        System.out.println(Arrays.toString(arr));
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));


    }

    static void swap(int[] arr,int indx1, int indx2){
        int c = arr[indx1];
        arr[indx1] = arr[indx2];
        arr[indx2] = c; 
    }
}
