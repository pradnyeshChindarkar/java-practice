import java.util.Scanner;

public class LargeNum {
    public static void main(String[] args) {
        int a, b, c, max;

        System.out.print("Give input for a b c: ");
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        in.close();
        
        max = a;
        if (b>max) {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        System.out.println(max);

    }
}
