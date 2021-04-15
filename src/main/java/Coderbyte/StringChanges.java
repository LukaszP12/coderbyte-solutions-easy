package Coderbyte;

public class StringChanges {


//    Whenever a capital M is encountered, duplicate the previous character (then remove the M),
//    and whenever a capital N is encountered remove the next character from the string (then remove the N).
//    All other characters in the string will be lowercase letters.
//    For example: "abcNdgM" should return "abcgg". The final string will never be empty.

    public static String StringChanges(String str) {

        StringBuilder sb = new StringBuilder();

        boolean firstChar = true;
        boolean previousN = false;
        char previousChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (firstChar && previousChar != 'M' && previousChar != 'N') {
                sb.append(previousChar);
                firstChar = false;
            }

            char c = str.charAt(i);

            if (previousN) {
                previousN = false;
                continue;
            }

            if (c == 'M') {
                if (previousChar != 'M' && previousChar != 'N') {
                    sb.append(previousChar);
                }
            }

            if (c == 'N') {
                previousN = true;
            }

            if (c != 'M' && c != 'N' && i != 0) {
                sb.append(c);
                previousChar = c;
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = StringChanges("MrtyNNgMM");
        System.out.println(s);

        String s1 = StringChanges("oMoMkkNrrN");
        System.out.println(s1);

        //incorrect cases
        //toDo the method also prints char double when first char is 'M'
        String s2 = StringChanges("MrtyNNg");
        System.out.println(s2);

        String s3 = StringChanges("MMMMMokM");
        System.out.println(s3);

        String s4 = StringChanges("MMMMMokN");
        System.out.println(s4);

        String s5 = StringChanges("MrtyNNgMM");
        System.out.println(s5);

    }

}
