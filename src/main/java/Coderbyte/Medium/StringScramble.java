package Coderbyte.Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringScramble {

    // how to check if one Map contains other Map
    public static boolean StringScramble(String str1, String str2) {
        Map<Character,Integer> map1 = new HashMap<Character,Integer>();
        Map<Character,Integer> map2 = new HashMap<Character,Integer>();

        for (int i=0;i<str1.length();i++){
            Integer val = map1.get(str1.charAt(i));

            if (val == null){
                map1.put(str1.charAt(i),1);
            } else {
                map1.put(str1.charAt(i),val+1);
            }
        }

        for (int i=0;i<str2.length();i++){
            Integer val1 = map1.get(str2.charAt(i));

            if (val1 == null){
                map2.put(str2.charAt(i),1);
            } else {
                map2.put(str2.charAt(i),val1+1);
            }
        }

        System.out.println(map1.entrySet());
        System.out.println(map2.entrySet());

        return map2.entrySet().containsAll(map1.entrySet());
    }

    public static boolean StringScramble2(String str1, String str2) {
        char[] cArray = str2.toCharArray();
        Set<Character> testChars = new HashSet<Character>();
        for (int i = 0; i < cArray.length; i++) {
            if (!testChars.contains(cArray[i])) {
                //System.out.println("[^"+cArray[i]+"]");
                if (str1.replaceAll("[^" + cArray[i] + "]", "").length() >= str2.replaceAll("[^" + cArray[i] + "]", "").length()) {
                    //System.out.println("[^"+cArray[i]+"]");
                    testChars.add(cArray[i]);
                } else
                    return false;
            }
        }
    return true;
    }

    public static void main(String[] args) {
        System.out.println(StringScramble2("cdore","coder"));
        System.out.println(StringScramble2("h3llko","hello"));
    }

}
