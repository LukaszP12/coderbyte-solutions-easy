package Codility.StacksQueues;

import java.util.Stack;

public class Brackets {

    public static int solution(String s) {
        if (s.length() == 0)
            return 1;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == '[') {
                stack.push(']');
            } else if (s.charAt(i) == '{') {
                stack.push('}');
            } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                if (stack.isEmpty() == true) {
                    return 0;
                } else {
                    char temp = stack.pop();
                    if (temp != s.charAt(i)) {
                        return 0;
                    }
                }
            }
        }

            if (!stack.isEmpty()) {
                return 0;
            } else {
                return 1;
            }

        }

    public static void main(String[] args) {
        String s1 = "{[()()]}";
        System.out.println(solution(s1));
    }

}