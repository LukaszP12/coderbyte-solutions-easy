package Coderbyte.Medium;

import java.util.HashSet;
import java.util.Set;

public class KUniqueCharacters {

    public static String KUniqueCharacters(String str) {
        String maxSubset = "";
        int uniqueChars = Integer.parseInt(str.substring(0, 1));
        char[] chars = str.substring(1).toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            Set<Character> set = new HashSet<>();
            StringBuilder subset = new StringBuilder();
            for (int j = i; j < chars.length; j++) {
                if (set.contains(chars[j])) {
                    subset.append(chars[j]);
                } else {
                    if (set.size() == uniqueChars) {
                        break;
                    } else {
                        subset.append(chars[j]);
                        set.add(chars[j]);
                    }
                }
            }
            if (subset.length() > maxSubset.length()) {
                maxSubset = subset.toString();
            }
        }

        return maxSubset;
    }

    public static String KUniqueCharacters2(String str) {
        int initValue = Integer.parseInt(str.substring(0, 1));

        String substring = str.substring(1);
        int longest = 0;
        StringBuilder result = new StringBuilder();

        char[] charArray = str.substring(1).toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            Set<Character> charSet = new HashSet<>();
            int length = 0;
            for (int j = i; j < str.length(); j++) {
                charSet.add(charArray[j]);
                length++;
                if (charSet.size() > initValue) {
                    length--;
                    break;
                }
            }
            if (length > longest) {
                longest = length;
                result.append(str.substring(i, i + length));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(KUniqueCharacters("3aabacbebebe"));
        System.out.println(KUniqueCharacters("2aabbcbbbadef"));

        System.out.println(KUniqueCharacters2("2aabbcbbbadef"));
        System.out.println(KUniqueCharacters2("2aabbacbaa"));
    }

}
