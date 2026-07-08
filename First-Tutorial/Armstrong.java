// import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // int num = in.nextInt();
        // in.close();

        for(int i =100; i<1000;i++){
            if (isArmstrong(i)) {
                System.out.println(i+" is an Armstrong Number.");
            }
        }
        
    }

    static boolean isArmstrong(int num) {
        int ans = 0;
        int original = num;
        while (num > 0) {
            int rem = num % 10;
            ans += rem * rem * rem;
            num /= 10;
        }
        return ans==original;
    }
}
