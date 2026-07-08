package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(1*(0-0)/(0+1));

        for (int i = 0; i < n-1; i++) {
            for (int j = n-1; j > i; j--) {
                System.out.print("*");
            }
            
            for (int k = 0; k < (2 * i) + 1; k++) {
                if (k == 0 || k == (2*i)) {
                    System.out.print("d");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * (n - i) - 1; k++) {
                if (k == 0 || k == 2 * (n - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
