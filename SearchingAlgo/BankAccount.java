// import java.lang.reflect.Array;
// import java.util.Arrays;

public class BankAccount {
    public static void main(String[] args) {
        int[][] accts = { { 33, 100, 2 }, { 23, 53, 4 } };


        int ans = 0;
        for (int i = 0; i < accts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accts[i].length; j++) {
                sum += accts[i][j];
            }
            if (ans < sum) {
                ans = sum;
            }
        }
        System.out.println(ans);
        System.out.println("Person "+bankAcc(accts)+" is richest");
        
    }

    static int bankAcc(int[][] arr) {
        int maxacc = 0; 
        int person = 0;
        for(int[] i:arr){
            int sum = 0;
            for (int js : i) {
                sum += js;
            }
            if (maxacc < sum) {
                maxacc = sum;
                person++;
            }
        }
        return person;
    }
}
