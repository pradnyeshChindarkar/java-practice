package JavaPracticals.Practicals1Java;

import java.util.Arrays;

public class Practicals1 {
    public static void main(String[] args) {
        String arr1[] = new String[] { "abc","abcd","ajjk" };
        String arr2[] = new String[] { "abc","abcd","ajjk" };
        System.out.println(checkArray(arr1, arr2));

    }

    static <T> boolean checkArray(T[] arr1, T[] arr2) {
        int i = 0;

        if (arr1.length != arr2.length) {
            return false;
        }

        for (T t : arr1) {
            if (!t.equals(arr2[i])) {
                return false;
            }
            i++;
        }
        return true;
    }
}
