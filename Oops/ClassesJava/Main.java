package Oops.ClassesJava;


class Box<T> {
    T value;

    public void setName(T value) {
        this.value = value;
    }

    public T getName() {
        return this.value;
    }
}

public class Main {
    public static void main(String[] args) {

        Box<Integer> val1 = new Box<>();
        val1.setName(3);
        System.out.println(val1.getName());
        Box<Integer> val2 = new Box<>();
        val2.setName(3);
        System.out.println(val2.getName());

    }
}
