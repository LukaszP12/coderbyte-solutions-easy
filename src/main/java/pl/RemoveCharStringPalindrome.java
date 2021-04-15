package pl;

public class RemoveCharStringPalindrome {

    // given a string, we check whether it
    // is possible to make this string  a
    // palindrone after removing exactly one character from this.

    // 1. find the mismatch
    // 2. we can set 2 pointers, one at each end
    // 3. at mismatch, either remove character pointed by
    // left pointer or remove character pointed by right pointer

    // utility function to check, if String is palindrone
    static boolean isPalindrone(String s, int low, int high) {

        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;

        }

        return true;
    }

    static int possiblePalinByRemovingOneChar(String str) {
        int low = 0, high = str.length() - 1;

        while (low < high) {
            if (str.charAt(low) == str.charAt(high)) {
                low++;
                high--;
            } else {
                if (isPalindrone(str, low + 1, high)) {
                    return low;
                }

                if (isPalindrone(str, low, high - 1)) {
                    return high;
                }

                return -1;
            }
        }

        // we reach here when the complete string
        // will be palindrome if complete string
        // is palindrome then return mid character
        return -2;
    }


    public static void main(String[] args) {
        String str = "abecbea";
        int idx = possiblePalinByRemovingOneChar(str);

        if (idx == -1){
            System.out.println("Not Possible");
        } else if (idx == -2){
            System.out.println("Possible without \" + \n" +
                    "                          \"removing any character");
        } else {
            System.out.println("Possible by removing" +
                    " character at index " + idx);
        }

    }

}