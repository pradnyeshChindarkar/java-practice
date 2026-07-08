package JavaPracticals.Practicals1Java;

import java.util.Arrays;

public class GeneJava<T> implements Container<T> {

    private Object[] items;
    private int count;
    private int maxCapacity;


    public GeneJava() {
        this.maxCapacity = 10;
        this.count = 0;
        this.items = new Object[maxCapacity];
    }

    public GeneJava(int capacity) {
        this.maxCapacity = capacity;
        this.count = 0;
        this.items = new Object[maxCapacity];
    }

    @Override
    public void addAnItem(T item) {
        if (count == maxCapacity) {
            maxCapacity*=2;
            items = Arrays.copyOf(items, maxCapacity);
        }
        items[count++] = items;
    }

    @Override
    public void rmItem(int index) {
        if (index < 0 && index >= count) {
            throw new IndexOutOfBoundsException("Index: "+index);
        }
    }


    @Override
    public void retItem(int idx) {
    }

    public static void main(String[] args) {

    }
}
