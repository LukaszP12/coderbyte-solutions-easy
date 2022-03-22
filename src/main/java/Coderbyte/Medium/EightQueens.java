package Coderbyte.Medium;

public class EightQueens {

//    (x and y will both range from 1 to 8 where 1,1 is the bottom-left of the chessboard
//        and 8,8 is the top-right)

//    Your program should determine
//    if all of the queens are placed in such a way where none of them are attacking each other.

// If this is true for the given input, return the string true otherwise return the first queen
// in the list that is attacking another piece in the same format it was provided.


    public static String EightQueens(String[] strArr) {
        int[][] aux = new int[8][2];

        for (int i = 0; i < strArr.length; i++) {
            String[] aux2 = strArr[i].split(",");
            aux[i][0] = Integer.parseInt(aux2[0].substring(1));
            aux[i][1] = Integer.parseInt(aux2[1].substring(0, 1));
        }
        for (int i = 0; i < aux.length; i++) {
            for (int j = i + 1; j < aux.length; j++) {
                int dif1 = Math.abs(aux[i][0] - aux[j][0]);
                int dif2 = Math.abs(aux[i][1] - aux[j][1]);
                if (dif1 == dif2 || dif1 == 0 || dif2 == 0) {
                    return strArr[i];
                }
            }
        }
        return "true";
    }

    public static void main(String[] args) {
        String[] strings = {"(2,1)", "(4,3)", "(6,3)", "(8,4)", "(3,4)", "(1,6)", "(7,7)", "(5,8)"};
        System.out.println(EightQueens(strings));

        String[] strings1 = {"(2,1)", "(5,3)", "(6,3)", "(8,4)", "(3,4)", "(1,8)", "(7,7)", "(5,8)"};
        System.out.println(EightQueens(strings1));

    }


}
