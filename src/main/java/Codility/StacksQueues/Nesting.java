package Codility.StacksQueues;

import java.util.Stack;

public class Nesting {

//    For example, string "(()(())())" is properly nested but string "())" isn't.

    public static int solution(String s){

        if (s.length() == 0) return 1; // empty string

        else if (s.length() % 2 == 1) return 0;

        Stack<Character> stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return 0;
                } else {
                    char temp = s.charAt(i);
                    if (stack.pop() != temp) {
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
        System.out.println("(()(())())" + "result: " + solution("(()(())())"));
        System.out.println("(()(())())" + "result: " + solution("())"));
    }

}
