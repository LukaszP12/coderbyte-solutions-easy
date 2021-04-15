package Codility.StacksQueues;

import java.util.Stack;

// minimum number of blocks needed to build a wall

public class StoneWall {

    public int solution(int[] H){
        Stack<Integer> stack = new Stack<>();
        int numBlock = 0;

        for (int i=0;i<H.length;i++){
             // step 1: "stack is not empty" and "high to low"

            while (!stack.isEmpty() && stack.peek() > H[i]){
                stack.pop();
            }

            // step 2: stack is empty
            if (stack.isEmpty()){
                numBlock++;
                stack.push(H[i]);
            }

            // step 3: the height is the same: do nothing
            else if (stack.peek() == H[i]){

            }

            // step 4: from low to high
            else if(stack.peek() < H[i]){
                numBlock++;
                stack.push(H[i]);
            }

        }


        return numBlock;
    }


}
