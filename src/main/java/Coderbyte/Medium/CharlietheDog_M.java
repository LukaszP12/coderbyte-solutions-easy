package Coderbyte.Medium;

import java.util.ArrayList;
import java.util.List;

public class CharlietheDog_M {

    static int leastMoves = 0;

    static int yCharlie = 0;
    static int xCharlie = 0;

    static int yHome = 0;
    static int xHome = 0;

    public static int CharlietheDog_M(String[] strArr) {

        int rows = strArr.length;
        int cols = strArr[0].length();

        List<String> foods = new ArrayList<>();


        for (int y = 0; y < rows; y++) {
            for (int x = 0; x < cols; x++) {
                char charAt = strArr[y].charAt(x);
                if (charAt == 'F') {
                    foods.add(x + "," + y);
                }

                if (charAt == 'C') {
                    yCharlie = y;
                    xCharlie = x;
                }

                if (charAt == 'H') {
                    yHome = y;
                    xHome = x;
                }
            }
        }


        boolean[][] visited = new boolean[rows][cols];
        moveDog(strArr, xCharlie, yCharlie, 0, foods, 0, visited);


        return leastMoves;
    }

    private static void moveDog(String[] strArr, int x, int y, int moves, List<String> foods, int eaten, boolean[][] visited) {

        int rows = strArr.length;
        int cols = strArr[0].length();

        if (x < 0 || x >= cols || y < 0 || y >= rows || visited[y][x]) {
            return;
        }

        if (eaten == foods.size() && y == yHome && x == xHome) {

            if (moves > leastMoves) {
                leastMoves = moves;
            }
            return;
        }

        visited[y][x] = true;

        String currentLocation = x + "," + y;
        if (foods.contains(currentLocation)) {
            eaten++;
        }

        int[] waysX = {1, 0, -1, 0};
        int[] waysY = {0, 1, 0, -1};

        for (int i = 0; i < waysX.length; i++) {
            moveDog(strArr, x + waysX[i], y + waysY[i], moves + 1, foods, eaten, visited);
        }

    }

    public static void main(String[] args) {
        String[] strings = {"OOOO", "OOFF", "OCHO", "OFOO"};
        System.out.println(CharlietheDog_M(strings));

//        String[] strings1 = {"FOOO", "OCOH", "OFOF", "OFOO"};
//        System.out.println(CharlietheDog_M(strings1));
    }

}