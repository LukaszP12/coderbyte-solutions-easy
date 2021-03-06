package Coderbyte;


//Have the function SimpleAdding(num) add up all the numbers from 1 to num. For example:
//        if the input is 4 then your program should return 10 because 1 + 2 + 3 + 4 = 10.

public class SimpleAdding {

    public static int simpleAdding(int num){
        int sum = 0;

        for (int i=1; i<=num; i++){
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(simpleAdding(12));
        System.out.println(simpleAdding(140));
    }

}
