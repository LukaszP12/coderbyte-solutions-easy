package Codility.StacksQueues;

import java.util.Stack;

public class StoneWall1 {

    public static int solution(int[] H) {

        int numOfBlocks = 0;

        Stack<Integer> stack = new Stack<>();

        for (int h : H) {

            while (!stack.isEmpty() && stack.peek() > h) {
                stack.pop();
            }

            // the stack is empty
            if (stack.isEmpty()) {
                numOfBlocks++;
                stack.push(h);
            }

            // we are still on the same level
            if (stack.peek() == h) {

            }


            if (stack.peek() < h) {
                stack.push(h);
                numOfBlocks++;
            }
        }

        return numOfBlocks;
    }


    public static void main(String[] args) {
        int tab[] = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(solution(tab));
    }

}
