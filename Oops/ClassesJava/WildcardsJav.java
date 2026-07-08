package Oops.ClassesJava;

import java.util.Arrays;
import java.util.List;

class WildcardsJav {
    public static void main(String[] args)
    {
        // Lower Bounded Integer List
        List<Number> list1 = Arrays.asList(4,5,6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list1);

        // Number list
        List<Number> list2 = Arrays.asList(4, 5.88299999999, 6, 7);

        // Integer list object is being passed
        printOnlyIntegerClassorSuperClass(list2);
    }

    public static void printOnlyIntegerClassorSuperClass(
        List<? super Integer> list)
    {
        System.out.println(list);
    }
}