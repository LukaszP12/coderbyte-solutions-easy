package Coderbyte.Medium;

public class EightQueens2 {

    public static String EightQueens2(String[] strArr) {

        for (int i = 0; i < strArr.length; i++) {
            for (int j = i + 1; j < strArr.length; j++) {
                if (isAttack(strArr[i], strArr[j])) {
                    return strArr[i];
                }
            }
        }

        return "true";
    }

    private static boolean isAttack(String queen1, String queen2) {
        int[] q1 = new int[]{Integer.parseInt(queen1.substring(1, 2)), Integer.parseInt(queen1.substring(3, 4))};
        int[] q2 = new int[]{Integer.parseInt(queen2.substring(1, 2)), Integer.parseInt(queen2.substring(3, 4))};

        return (q1[0] == q2[0]) || (q1[1] == q2[1]) || (Math.abs(q1[1] - q2[1]) == Math.abs(q1[0] - q2[0]));
    }

    public static void main(String[] args) {
        String[] strings = {"(2,1)", "(4,3)", "(6,3)", "(8,4)", "(3,4)", "(1,6)", "(7,7)", "(5,8)"};
        System.out.println(EightQueens2(strings));

        String[] strings1 = {"(2,1)", "(5,3)", "(6,3)", "(8,4)", "(3,4)", "(1,8)", "(7,7)", "(5,8)"};
        System.out.println(EightQueens2(strings1));
    }
}
