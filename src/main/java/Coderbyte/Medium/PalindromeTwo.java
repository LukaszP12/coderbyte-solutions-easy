package Coderbyte.Medium;

public class PalindromeTwo {

    public static Boolean PalindromeTwo(String str) {
        String s = str.replaceAll("[^A-Za-z]", "").toLowerCase();
        System.out.println(s);

        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != charArray[charArray.length-1-i]){
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(PalindromeTwo("Noel - sees Leon"));
        System.out.println(PalindromeTwo("A war at Tarawa!"));
    }

}
