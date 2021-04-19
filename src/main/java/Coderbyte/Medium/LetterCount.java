package Coderbyte.Medium;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterCount {

    public static String LetterCount(String str) {
        String[] words = str.split(" ");
        Pattern pattern = Pattern.compile("(.)(?=(.*?\\1))");

        String longestWord = "-1";
        int highestCount = 0;

        for (String word : words) {
            Set<String> counts = new HashSet<String>();
            Matcher matcher = pattern.matcher(word);

            int count = 0;
            while (matcher.find()) {
                String found = matcher.group(1);
                if (!counts.contains(found)) {
                    count++;
                    counts.add(found);
                }
            }

            if (count > highestCount)
            {
                highestCount = count;
                longestWord = word;
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {

    }

}
