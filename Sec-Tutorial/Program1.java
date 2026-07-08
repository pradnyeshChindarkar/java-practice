import java.util.Arrays;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] arr = new String[4];
        // arr[0]=2;
        // arr[1]=54;
        // arr[2]=432;
        // arr[3]=885;
        for(int i=0;i<arr.length;i++){
            System.out.println("i -> "+i);
            if (i!=2){
                arr[i]=in.next();
            }
        }
        // arr[2] = "String outside";
        in.close();

        // System.out.println(Arrays.toString(arr));

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }

        System.out.println(Arrays.toString(arr));
        for (String num : arr) {
            if (num!=null){
                System.out.println(num);
            }
        }
    }
    
}