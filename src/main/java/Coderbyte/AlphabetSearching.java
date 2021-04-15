package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphabetSearching {

    final static Character[] alphabet = new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'
            ,'s','t','u','v','w','x','y','z'};

    public static String AlphabetSearching(String str) {

        List<Character> currentLetters = new ArrayList<Character>();

        for (int i=0;i<str.length();i++){
            currentLetters.add(str.charAt(i));
        }

        for (int i=0;i<alphabet.length;i++){
            if (!currentLetters.contains(Character.valueOf(alphabet[i]))){
                return "false";
            }
        }

        return "true";
    }


    public static void main(String[] args) {
        System.out.println(AlphabetSearching("abcdefghijklmnopqrstuvwxyyyy"));
        System.out.println(AlphabetSearching("abc123456kmo"));

    }

}
