package JavaPracticals.Practicals1Java;

import java.util.ArrayList;
import java.util.List;

public class ListGenerics {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(12);
        list.add(3);
        list.add(3);
        list.add(1);

        sumOfEvenOdd(list);
    }

    public static <T extends Number> void sumOfEvenOdd(List<T> nums) {
        long sumEven = 0;
        long sumOdd = 0;

        for (T t : nums) {
            long val = t.longValue();
            if (val % 2 == 0) {
                sumEven+=val;
            }
            else{
                sumOdd+=val;
            }
        }

        System.out.println("Sum of all Even Numbers is: "+ sumEven);
        System.out.println("Sum of all Odd Numbers is: "+ sumOdd);
    }
}
