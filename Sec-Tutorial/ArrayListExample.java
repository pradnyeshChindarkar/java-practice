import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);

        Scanner in = new Scanner(System.in);


        // arr.add(39);
        // arr.add(221);
        // arr.add(211);

        // for (Integer i : arr) {
        // System.out.println(i);
        // }

        // for (int i = 0; i < 3; i++) {
        //     arr.add(in.nextInt());
        // }

        // System.out.println(arr.size());

        System.out.println(arr);
        in.close();
    }
}
