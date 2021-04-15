package Codility.StacksQueues;

import java.util.Stack;

public class Fish {

    public static int solution(int[] A, int[] B) {
        int fishAlive = B.length;
        Stack<Integer> fishStack = new Stack<Integer>();

        for (int i = 0; i < B.length; i++) {

            if (B[i] == 1) {
                fishStack.add(A[i]);
            }

            if (B[i] == 0) {
                while (!fishStack.isEmpty()) {
                    if (A[i] > fishStack.peek()) {
                        fishStack.pop();
                        fishAlive--;
                    } else {
                        fishAlive--;
                        break;
                    }
                }

            }

        }

        return fishAlive;
    }

    public static void main(String[] args) {
        int A[] = {4,3,2,1,5};
        int B[] = {0,1,0,0,0};

        System.out.println("Fish alive: " + solution(A,B));
    }

}
