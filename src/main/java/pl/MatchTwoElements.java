package pl;

import java.util.HashMap;
import java.util.Map;

public class MatchTwoElements {

    public static boolean matchTwoElements(String string1, String string2) {

        int length = string1.length();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();

        for (int i = 0; i < length; i++) {

            char c = string1.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, new Integer(val) + 1);
            } else {
                map.put(c, 1);
            }

            char c1 = string2.charAt(i);
            Integer val1 = map1.get(c1);
            if (val1 != null) {
                map1.put(c1, new Integer(val1) + 1);
            } else {
                map1.put(c1, 1);
            }
        }

        return map.entrySet().stream().allMatch(e -> e.getValue().equals(map1.get(e.getKey())));
    }

    public static boolean matchTwoElements2(String string1, String string2) {
        int length = string1.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        for (int i = 0; i < length; i++) {
            map.put(string1.charAt(i), map.getOrDefault(string1.charAt(i), 0) + 1);
            map1.put(string2.charAt(i), map1.getOrDefault(string2.charAt(i), 0) + 1);
        }

        return map.entrySet().stream().allMatch(e -> e.getValue().equals(map1.get(e.getKey())));
    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Name");

        System.out.println(map.entrySet());

        boolean b1 = matchTwoElements("MARA", "RAMA");
        boolean b2 = matchTwoElements2("MARA", "RAMA");
        System.out.println(b1);
        System.out.println(b2);

    }

}
