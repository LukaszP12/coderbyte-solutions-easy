package Codility.TimeComplexity;

public class PermMissingElem {


    public static int solution(int A[]){
        boolean[] resultArray = new boolean[A.length+1];

        for(int i=0;i<A.length;i++){
            resultArray[A[i]-1] = true;
        }

        for (int i=0; i<resultArray.length; i++){
            if (!resultArray[i]){
                return i+1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int A[] = {2,3,1,5};
        System.out.println(solution(A));
    }

}
