package Coderbyte.Medium;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SimpleMode {

    public static int SimpleMode(int[] arr) {

        int largest = 0;
        int bigInt = 0;
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {
            Integer key = arr[i];
            Integer val = 1;
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, val);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > largest) {
                largest = entry.getValue();
                bigInt = entry.getKey();
            }
        }

        if (largest == 1) {
            return -1;
        } else {
            return bigInt;
        }
    }


    public static void main(String[] args) {
        int[] ints = {5, 5, 2, 2, 1};
        System.out.println(SimpleMode(ints));

        int[] ints1 = {3, 4, 1, 6, 10};
        System.out.println(SimpleMode(ints1));
    }

}
