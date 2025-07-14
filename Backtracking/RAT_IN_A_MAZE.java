public class RAT_IN_A_MAZE {

    static void ratInAMaze(int[][] matrix, boolean[][] visited, int i, int j, String path, int n, int m) {
        if (i == n - 1 && j == m - 1) { // bottom right corner reached
            System.out.println(path);
            return;
        }
        // The direction of the movement is DLR

        // first move down
        if (isValid(i + 1, j, matrix, visited)) {
            visited[i + 1][j] = true;
            ratInAMaze(matrix, visited, i + 1, j, path + "D", n, m);
            // backtracking
            visited[i + 1][j] = false;
        }

        // second move left
        if (isValid(i, j - 1, matrix, visited)) {
            visited[i][j - 1] = true;
            ratInAMaze(matrix, visited, i, j - 1, path + "L", n, m);
            // backtracking
            visited[i][j - 1] = false;
        }

        // third move right
        if (isValid(i, j + 1, matrix, visited)) {
            visited[i][j + 1] = true;
            ratInAMaze(matrix, visited, i, j + 1, path + "R", n, m);
            // backtracking
            visited[i][j + 1] = false;
        }

        // fourth move up
        if (isValid(i - 1, j, matrix, visited)) {
            visited[i - 1][j] = true;
            ratInAMaze(matrix, visited, i - 1, j, path + "U", n, m);
            // backtracking
            visited[i - 1][j] = false;
        }
    }

    static boolean isValid(int i, int j, int[][] matrix, boolean[][] visited) {
        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[i][j] == 1 && !visited[i][j]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1, 0 },
                { 1, 0, 0, 1 },
                { 1, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };
        int n = matrix.length;// 4
        int m = matrix[0].length;// 4
        boolean visited[][] = new boolean[n][m];

        // Mark starting position as visited and call the function
        visited[0][0] = true;
        ratInAMaze(matrix, visited, 0, 0, "", n, m);

    }
}
