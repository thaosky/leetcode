package stackQueue.stack;

import java.util.Stack;

public class _20_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char popped = stack.pop();
                if (popped != c) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        System.out.println(isValid(s));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
    }
}
