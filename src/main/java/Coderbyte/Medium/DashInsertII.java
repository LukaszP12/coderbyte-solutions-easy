package Coderbyte.Medium;

public class DashInsertII {

    public static String DashInsertII(int num) {
        StringBuilder result = new StringBuilder();

        String numerAsString = String.valueOf(num);

        for (int i = 0; i < numerAsString.length() - 1; i++) {

            result.append(numerAsString.charAt(i));

            if (numerAsString.charAt(i) != '0' && numerAsString.charAt(i + 1) != '0' && !isEven(Character.getNumericValue(numerAsString.charAt(i))) && !isEven(Character.getNumericValue(numerAsString.charAt(i + 1)))) {
                result.append('-');
            }
            if (numerAsString.charAt(i) != '0' && numerAsString.charAt(i + 1) != '0' && isEven(Character.getNumericValue(numerAsString.charAt(i))) && isEven(Character.getNumericValue(numerAsString.charAt(i + 1)))) {
                result.append('*');
            }

        }

        result.append(numerAsString.charAt(numerAsString.length() - 1));

        return result.toString();
    }

    private static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(DashInsertII(99946));

        System.out.println(DashInsertII(56647304));

        System.out.println(DashInsertII(56647324));

        // incorrect cases 10120
        System.out.println(DashInsertII(10120));

        // incorrect cases 60497642
        System.out.println(DashInsertII(60497642));

        // incorrect cases 667488958374553
        System.out.println(DashInsertII(667488958374553));
    }

}
