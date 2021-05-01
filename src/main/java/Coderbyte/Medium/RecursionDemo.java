package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.List;

public class RecursionDemo {

    public static void calcDemp(int num, List<Integer> counter) {

        if (num % 2 == 0) {
            counter.add(num);
        }

        if (num % 2 != 0) {
            return;
        }

        for (int i = 0; i < num; i++) {
            calcDemp(i, counter);
        }

    }

    private static void showList(List<Integer> counter) {
        for (int a : counter) {
            System.out.println(a);
        }
    }

    public static void function(int num) {
        List<Integer> counts = new ArrayList<Integer>();
        calcDemp(num, counts);
        showList(counts);
    }

    public static void main(String[] args) {
        function(20);

    }

}
