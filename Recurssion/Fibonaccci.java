package Recurssion;

public class Fibonaccci {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }

    static int sum(int n) {
        if(n<2){
            return n;
        }
        return sum(n-1)+sum(n-2);
    }
}
