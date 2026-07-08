package StringTut;

import java.util.Arrays;

public class ques5 {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] newarr = s.split(" ");
        String[] strarr = new String[newarr.length];

        StringBuilder sb = new StringBuilder();
        for (String string : newarr) {
            int i = (int) (string.charAt(string.length() - 1) - '0');
            strarr[i - 1] = string.substring(0, string.length() - 1);
        }
        System.out.println(Arrays.toString(strarr));
        System.out.println(strarr.length);


        int i =0;
        for (i = 0; i < strarr.length-1; i++) {
            sb.append(strarr[i]).append(" ");
        }
        sb.append(strarr[i]);
    }
}
