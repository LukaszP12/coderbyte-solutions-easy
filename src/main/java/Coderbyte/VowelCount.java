package Coderbyte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VowelCount {

    final static Character[] vowelsArrays = {'a','e','i','j','o','u'};

    public static int VowelCount(String str) {


        List<Character> vowels1 = Arrays.asList(vowelsArrays);

        List<Character> vowels = new ArrayList<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('j');
        vowels.add('o');
        vowels.add('u');


        int counter = 0;
        for (int i=0; i<str.length(); i++) {
            if (vowels.contains(str.charAt(i)))
            {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(VowelCount("hello"));
        System.out.println(VowelCount("coderbyte"));
    }

}
