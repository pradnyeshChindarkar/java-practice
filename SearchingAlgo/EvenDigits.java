/* 
 * Store number with Even no. of Digit
 * For e.g. 
 * 12 -> 2 digit so even digit
 * 231 -> 3 digit so odd number
*/

public class EvenDigits {
    public static void main(String[] args) {
        int[] num = { 12, 345, 2, 6, 7896 };

        for (int i : num) {
            if (isEven(i)) {
                System.out.println(i);
            }
        }

    }

    static boolean isEven(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }

        return count % 2 == 0;
    }
}
