package Coderbyte.Medium;

public class FibonacciChecker {

    public static String FibonacciChecker(int num) {

        if (num == 0){return "yes";}

        if (num == 1){return "yes";}

        // fibonacci sequence
        int fib1 = 0;
        int fib2 = 1;

        while (fib2 < num){
            int fn = fib2 + fib1;
            fib2 = fib1;
            fib1 = fn;
            if (fn == num) {return "yes";}
        }

        return "no";
    }


    public static void main(String[] args) {
        System.out.println(FibonacciChecker(34));
        System.out.println(FibonacciChecker(54));
    }

}
