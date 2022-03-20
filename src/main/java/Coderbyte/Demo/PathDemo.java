package Coderbyte.Demo;

public class PathDemo {


    // Method for finding and printing
    // whether the path exists or not
    public static void isPath(int matrix[][], int n) {
        boolean visited[][] = new boolean[n][n];

        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    if (isPath(matrix, i, j, visited)) {
                        flag = true;
                        break;
                    }
                }
            }
            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    // returns true if there is a path from the source (a cell with value 1)
    // to the destination (a cell with a value 2)
    private static boolean isPath(int[][] matrix, int i, int j, boolean[][] visited) {
        // checking the boundaries, walls and whether
        // the cell is unvisited
        if (isSafe(i, j, matrix) && matrix[i][j] != 0 && !visited[i][j]) {
            visited[i][j] = true;

            // if destination
            if (matrix[i][j] == 2) {
                return true;
            }

            boolean up = isPath(matrix, i - 1, j, visited);

            if (up)
                return true;

            boolean left = isPath(matrix, i, j - 1, visited);

            if (left)
                return true;

            boolean down = isPath(matrix, i + 1, j, visited);

            if (down)
                return true;

            boolean right = isPath(matrix, i, j + 1, visited);

            if (right)
                return true;

        }

        return false;
    }

    // method for checking boundaries
    private static boolean isSafe(int i, int j, int[][] matrix) {
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix.length) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {0, 3, 0, 1},
                {3, 0, 3, 3},
                {2, 3, 3, 3},
                {0, 3, 3, 3}
        };

        isPath(matrix, 4);

    }

}
