package Oops.GenericJava;

public class BubbleSort {

    public static <T extends Comparable<T>> void bubbleSortGen(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    T temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        Integer[] arr = { 3, 1, 6, 4, 5 };
        bubbleSortGen(arr);

        for (Integer x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        String[] str = { "ab", "abcd", "abc" };
        bubbleSortGen(str);
        for (String x : str) {
            System.out.print(x + " ");
        }

    }
}
