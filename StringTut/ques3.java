package StringTut;

public class ques3 {
    public static void main(String[] args) {

        System.out.println(interpret("(al)G(al)()()G"));
    }

    static String interpret(String command) {

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            
            if(command.charAt(i) == 'G'){
                str.append("G");
            }
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == 'a') {
                    str.append("al");
                    i+=3;
                } else {
                    str.append("o");
                    i++;
                }
            }
        }

        // return command.replace("()", "o").replace("(al)", "al");

        return str.toString();
    }
}
