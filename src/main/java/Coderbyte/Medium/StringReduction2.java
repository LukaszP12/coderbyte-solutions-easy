package Coderbyte.Medium;

public class StringReduction2 {

    public static int Count(String str) {
        int min = Integer.MAX_VALUE;
        char pre = str.charAt(0);
        boolean allSame = true;
        if (str.length() == 1) {
            return 1;
        }
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            // System.out.println("pre: -"+ pre +"- char at "+i+" is : -"+
            // str.charAt(i)+"-");
            if (pre != str.charAt(i)) {
                allSame = false;
                char rep = (char) (('a' + 'b' + 'c') - (pre + str.charAt(i)));
                // System.out.println("rep :" + rep);
                if (str.length() == 2)
                    count = 1;
                else if (i == 1)
                    count = Count(rep + str.substring(2, str.length()));
                else if (i == str.length() - 1)
                    count = Count(str.substring(0, str.length() - 2) + rep);
                else
                    count = Count(str.substring(0, i - 1) + rep + str.substring(i + 1, str.length()));

                if (min > count)
                    min = count;
            } else if (allSame) {
                count++;
            }
            pre = str.charAt(i);
        }

        if (allSame)
            return count;
        return min;
    }


    public static void main(String[] args) {
        System.out.println(Count("abcabc"));
        System.out.println(Count("cccc"));
    }
}
