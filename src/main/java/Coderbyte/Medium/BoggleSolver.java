package Coderbyte.Medium;

import java.util.Arrays;
import java.util.List;

public class BoggleSolver {

    public static String BoggleSolver(String[] strArr) {
        String[] words = strArr[1].split(",");
        String[] rows = strArr[0].split(", ");
        StringBuilder res = new StringBuilder();
        char[][] grid = new char[rows.length][rows.length];

        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < rows.length; j++) {
                grid[i][j] = rows[i].charAt(j);
            }
        }

        for (String word : words) {
            if (word.length() > 16) {
                continue;
            }

            char[][] gridCopy = new char[grid.length][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    gridCopy[i][j] = grid[i][j];
                }
            }

            if (!hasValidConstruction(word, gridCopy)) {
                res.append(word).append(",");
            }
        }

        return res.length() == 0 ? "true" : res.substring(0, res.length() - 1).toString();
    }

    private static boolean hasValidConstruction(String word, char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (canConstructWord(word, grid, i, j)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean canConstructWord(String word, char[][] grid, int row, int col) {
        if (word.isEmpty()) {
            return true;
        }

        char ch = word.charAt(0);
        int[] rowDirection = new int[]{-1, 1, 0, 0, -1, -1, 1, 1};
        int[] colDirection = new int[]{0, 0, -1, 1, -1, 1, -1, 1};
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rowDirection.length; i++) {
            int newRow = row + rowDirection[i];
            int newCol = col + colDirection[i];

            if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols) {
                continue;
            }

            char nextChar = grid[newRow][newCol];

            if (ch == nextChar) {
                grid[newRow][newCol] = '.';

                if (canConstructWord(word.substring(1), grid, newRow, newCol)) {
                    return true;
                }

                grid[newRow][newCol] = nextChar;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        String[] strings1 = {"aaey, rrum, tgmn, ball", "all,ball,mur,raeymnl,tall,true,trum"};
        System.out.println(BoggleSolver(strings1));

        String[] strings = {"aaey, rrum, tgmn, ball", "all,ball,mur,raeymnl,rumk,tall,true,trum,yes"};
        BoggleSolver(strings);
        System.out.println(BoggleSolver(strings));
    }

}
