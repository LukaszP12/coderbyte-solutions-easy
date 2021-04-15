package Codility.FibonacciNumbers;

//You have to climb up a ladder. The ladder has exactly N rungs, numbered from 1 to N.
//        With each step, you can ascend by one or two rungs. More precisely:

public class Ladder {

    public static int[] solution(int[] A,int[] B) {

        int L = A.length;

        //determine the "max" for Fibonacci
        int max = 0;
        for (int i=0;i<L;i++){
            max = Math.max(A[i],max);
        }

        int[] fibonacci = new int[max + 1];

        // initial setting of Fibonacci
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i=2; i<=max;i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]) % (1 << 30);
        }

        int[] results = new int[L];

        for (int i=0; i<L;i++){
            results[i] = fibonacci[A[i]] % (1 << B[i]);
        }

        return results;
    }

    public static void main(String[] args) {
        int A[] = {4,4,5,5,1};
        int B[] = {3,2,4,3,1};

        int[] solution = solution(A, B);
        for (int s : solution){
            System.out.println(s);
        }

    }

//    The signed left shift operator "<<" shifts a bit pattern to the left
//
//    The signed right shift operator ">>" shifts a bit pattern to the right.
//
//    The unsigned right shift operator ">>>" shifts a zero into the leftmost position

}