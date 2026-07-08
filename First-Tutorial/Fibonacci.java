import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter the length: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.close();
        
        int a = 0, b = 1, c;

        for (int i = 2; i < n; i++) {
            c = b;
            b += a;
            a = c;
        }
        if (n == 1) {
            System.out.println(0);
        } else {
            System.out.println(b);
        }

    }
}