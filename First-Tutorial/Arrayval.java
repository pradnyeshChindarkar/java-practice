import java.util.Arrays;

public class Arrayval {
    public static void main(String[] args) {
        int[] arr = {40,422,139,339};
        arrCh(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arrCh(int[] nums ){
        nums[0] = 99;
    }
}
