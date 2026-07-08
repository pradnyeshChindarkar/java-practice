package Oops.ClassesJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface A {
    public void print();

    public void delete();
}

interface Pretty extends A {
    public void printPretty();

    public void splitString();
}

class B implements Pretty {

    @Override
    public void printPretty() {

    }

    @Override
    public void splitString() {

    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }

    @Override
    public void delete() {
        System.out.println("Delete Item");
    }

    public void add() {
        System.out.println("Add");
    }
}

public class InterFaceJava {
    public static void main(String[] args) {

        Pretty av = new B();
        av.delete();

        List<Integer> list = new ArrayList<>();

        Set<Integer> set = new HashSet<Integer>();
        set.add(23);
        set.add(11);
        set.add(11);
        set.add(122);

        System.out.println(set);


        Map<Integer,String> mapList = new HashMap<>();
        mapList.put(100, "Surya");
        mapList.put(120, "SuryaR");


        System.out.println(mapList.get(100));

    }
}
