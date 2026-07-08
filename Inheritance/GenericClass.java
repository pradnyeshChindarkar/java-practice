import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Gen<T>{
    T data;
    Gen(){
        data=null;
    }
    Gen(T ele){
        data = ele;
    }

    T getData(){
        return data;
    }
}

public class GenericClass {
    public <T> void printArray(T[] arr){
        for (T element : arr) {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args){
        Gen<Integer> genInt = new Gen<>(322);
        System.out.println(genInt.getData());
        Gen<String> genStr = new Gen<>("Java");
        System.out.println(genStr.getData());


        GenericClass cc = new GenericClass();

        String[] arr = {"Java","SPM","ADBMS"};
        cc.<String>printArray(arr);

        Integer[] arr1 = {32,22,44};
        cc.printArray(arr1);

        Character[] chr = {'A','K','R'};
        cc.printArray(chr);

        Runnable runble = () -> System.out.println("Hello World");
        runble.run();

        List<String> list = Arrays.asList("Alice","Bob","Junior","Chetan");
        list.sort((a,b)->a.compareTo(b));
        System.out.println(list);
        List<String> lis = () -> 
    }
}
