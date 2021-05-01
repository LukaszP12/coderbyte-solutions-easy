package pl;

import java.util.HashMap;
import java.util.Map;

public class MatchTwoElements {

    public static boolean matchTwoElements(String string1, String string2) {

        string1.replaceAll("\\s", "");
        string2.replaceAll("\\s", "");

        if (string1.length() != string2.length()) {
            return false;
        }

        int length = string1.length();

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();

        for (int i = 0; i < length; i++) {

            char c = string1.charAt(i);
            Integer val = map.get(Character.toUpperCase(c));
            if (val != null) {
                map.put(Character.toUpperCase(c), Integer.valueOf(val) + 1);
            } else {
                map.put(Character.toUpperCase(c), 1);
            }

            char c1 = string2.charAt(i);
            Integer val1 = map1.get(Character.toUpperCase(c1));
            if (val1 != null) {
                map1.put(Character.toUpperCase(c1), Integer.valueOf(val) + 1);
            } else {
                map1.put(Character.toUpperCase(c1), 1);
            }
        }

        return map.entrySet().stream().allMatch(e -> e.getValue().equals(map1.get(e.getKey())));
    }

//    public static boolean matchTwoElements2(String string1, String string2) {
//
//        string1.replaceAll(" ", "");
//        string2.replaceAll(" ", "");
//
//        if (string1.length() != string2.length()) {
//            return false;
//        }
//
//        int length = string1.length();
//
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
//
//        for (int i = 0; i < length; i++) {
//            Integer val = map.get(Character.toUpperCase(string1.charAt(i)));
//            Integer val1 = map.get(Character.toUpperCase(string2.charAt(i)));
//
//            map.put(map.put(Character.toUpperCase(val),Integer.valueOf(val) + 1));
//            map1.put(Character.toUpperCase(string2.charAt(i)), map1.getOrDefault(Character.toUpperCase(string2.charAt(i)), 0) + 1);
//        }
//
//        return map.entrySet().stream().allMatch(e -> e.getValue().equals(map1.get(e.getKey())));
//    }

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Name");

        System.out.println(map.entrySet());

        boolean b1 = matchTwoElements("MARA", "RAMA");
        boolean b2 = matchTwoElements("MARA", "RAMA");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("r a ma".replaceAll("\\s", ""));
    }

}
