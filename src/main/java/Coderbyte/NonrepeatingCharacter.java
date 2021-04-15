package Coderbyte;

import java.util.*;
import java.util.stream.Collectors;

public class NonrepeatingCharacter {

    public static String NonrepeatingCharacter(String str) {
        Set<Character> checked = new HashSet<>();
        for (int i = 0; i < str.length() - 1; i++) {
            if (checked.contains(str.charAt(i))) continue;
            if (str.substring(i+1,str.length()).contains(""+str.charAt(i))){
                checked.add(str.charAt(i));
            } else {
                return ""+str.charAt(i);
            }
        }
        return ""+str.charAt(str.length()-1);
    }


    public static void main(String[] args) {
        System.out.println(NonrepeatingCharacter("abcdef"));
        System.out.println(NonrepeatingCharacter("hello world hi hey"));
    }

}

