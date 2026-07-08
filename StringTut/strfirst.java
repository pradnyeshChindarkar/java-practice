package StringTut;

public class strfirst {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("abc");
        // System.out.println(12);
        // sb.append(" junior");
        // System.out.println(sb);

        // String str = "abc";
        // System.out.println(str);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {  
            char chr = (char)('a' + i);
            builder.append(chr);
        }
        System.out.println(builder.toString());

    }
}
