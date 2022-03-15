package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LRUCache {

    public static String LRUCache(String[] strArr) {

        ArrayList<String> cache = new ArrayList<>();
        // cache can also be a Set

        for (int i = 0; i < strArr.length; i++) {
            if ((!cache.contains(strArr[i])) && (cache.size() < 5)) {
                cache.add(strArr[i]);
            } else if (cache.contains(strArr[i])) {
                cache.remove(strArr[i]);
                cache.add(strArr[i]);
            } else if ((!cache.contains(strArr[i])) && (cache.size() + 1 > 5)) {
                cache.remove(0);
                cache.add(strArr[i]);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < cache.size() - 1; i++) {
            result.append(cache.get(i) + "-");
        }
        result.append(cache.get(cache.size() - 1));

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"A", "B", "A", "C", "A", "B"};
        System.out.println(LRUCache(strings));

        String[] strings1 = {"A", "B", "C", "D", "E", "D", "Q", "Z", "C"};
        System.out.println(LRUCache(strings1));
    }
}
