package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LetterChanges {

    public static String LetterChanges(String str) {
        String letterChangedString = "";
        Character newCharacter;
        for (int i=0; i<str.length(); i++){
            newCharacter = str.charAt(i);
            if (isLetter(newCharacter))
            {
                newCharacter = ++newCharacter;

                if(isVowel(newCharacter))
                {
                    newCharacter = Character.toUpperCase(newCharacter);
                }
            }

            letterChangedString += newCharacter;
        }

        return letterChangedString;
    }

    private static boolean isLetter(Character character)
    {
        return Character.isLetter(character);
    }


    private static boolean isVowel(char character)
    {
        Character[] vowelArray = {'a','e','i','o','u','A','E','I','O','U'};
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList(vowelArray));

        if (vowels.contains(character))
        {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(LetterChanges(s.nextLine()));
        s.close();
    }


}