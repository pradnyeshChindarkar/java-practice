package Recurssion;

import java.util.Arrays;

public class Seq {
    public static void main(String[] args) {
        // 547 --> 745
        System.out.println(int()(Math.pow(10, 2)));
    }
    static int sum = 0;
    static void reverse(int n){
        if (n==0) {
            return;
        }
        int rem = n%10;
        sum = (sum * 10) + rem;
        reverse(n/10);
    }
}
