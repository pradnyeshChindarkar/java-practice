public class Class5 extends Thread {
    @Override
    public void run() {
        table();
    }
    public void table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(5 * i);
        }
    }
}
