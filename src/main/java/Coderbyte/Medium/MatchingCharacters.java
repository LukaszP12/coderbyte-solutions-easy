package Coderbyte.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatchingCharacters {

    public static String MatchingCharacters(String str) {
        Map<Character, Integer> hash = new HashMap<>();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = hash.get(c);
            if (val == null) {
                hash.put(c, i);
            } else {
                count(str,val+1,i);
                result = Math.max(result,count(str,val+1,i)); 
            }
        }


        return String.valueOf(result);
    }

    private static int count(String str, int from, int to) {
        Set<Character> set = new HashSet<>();
        int c = 0;
        for (int i=from;i<to;i++){
            char ch = str.charAt(i);
            if (!set.contains(ch)){
                c++;
                set.add(ch);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(MatchingCharacters("mmmerme"));
        System.out.println(MatchingCharacters("abccdefghi"));
    }

}
