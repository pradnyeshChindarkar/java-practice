package StringTut;

// import java.util.Arrays;

public class ques2 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };

        StringBuilder str = new StringBuilder("codeleet");

        for (int i = 0; i < indices.length; i++) {
            str.setCharAt(indices[i], s.charAt(i));
        }
        System.out.println(str);
    }
}
