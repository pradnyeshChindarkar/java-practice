package Others;
public class ThreadingExample {
    public static void main(String[] args) {
        Class2 class2 = new Class2();
        Class5 class5 = new Class5();

        class5.start();
        class2.start();
        System.out.println(4/0);
        System.out.println("Main Thread End");
    }

}
