package Codility.TimeComplexity;

public class FrogJmp {

    public static int solution(int X, int Y, int D) {

        int result = (Y - X) / D;

        if (((Y - X) % D) > 0){
            result += 1;
        }

        return result;
    }


    public static void main(String[] args) {
        System.out.println(solution(10,85,30));
    }

}
