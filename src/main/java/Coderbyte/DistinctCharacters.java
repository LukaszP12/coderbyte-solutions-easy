package Coderbyte;

import java.util.HashSet;
import java.util.Set;

public class DistinctCharacters {

    public static String DistinctCharacters(String str) {
        Set<Character> characterSet = new HashSet<Character>();

        for (int i=0;i<str.length();i++){
            characterSet.add(str.charAt(i));
        }

        return characterSet.size() >= 10 ? "true" : "false";
    }


    public static void main(String[] args) {

    }

}
