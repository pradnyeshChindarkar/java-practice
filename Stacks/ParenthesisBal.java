package Stacks;

import java.util.Stack;

public class ParenthesisBal {
    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatched(top, ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatched(char open,char close){
        if (open =='(' && close==')') return true;
        if (open =='{' && close=='}') return true;
        if (open =='[' && close==']') return true;
        return false;
    }
    public static void main(String[] args) {
        String expr = "{[sas][()]}{}";
        System.out.println(isBalanced(expr) ? "Balanced" : "Unbalanced");
    }
}
