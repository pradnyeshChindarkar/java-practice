package JavaPracticals.Practicals1Java;

import java.util.ArrayList;
import java.util.List;

public class ListMerging {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        list2.add("abc");
        list2.add("looe");
        list1.add("def");
        list1.add("ghi");

        System.out.println(list1);
        System.out.println(list2);
        
        System.out.println(returnList(list1, list2));
    }

    public static <T> List<T> returnList(List<T> list1, List<T> list2) {
        List<T> newlist = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if(i<size1){
                newlist.add(list1.get(i));
            }
            if(i<size2){
                newlist.add(list2.get(i));
            }
        }

        return newlist;

    }
}
