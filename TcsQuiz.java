public class TcsQuiz {
    public static void main(String[] args) {
        int num = 7811928;
        int digitStr = String.valueOf(num).length();
        int res = 0;
        int og = num / (int) Math.pow(10, digitStr - 1);
        while (num > 0) {
            int fd = num / (int) Math.pow(10, digitStr - 1);
            if (fd % 2 == 0) {
                if (num / 10 == 0) {
                    res = res * 10 + (fd + og) % 10;
                } else {
                    int sd = (num % (int) Math.pow(10, digitStr - 1)) / (int) Math.pow(10, digitStr - 2);
                    res = res * 10 + (fd + sd) % 10;
                }
            } else {
                res = res * 10 + ((fd * fd)%10);
            }
            num %= Math.pow(10, digitStr - 1);
            digitStr = String.valueOf(num).length();
        }
        System.out.println(res);
    }
}
