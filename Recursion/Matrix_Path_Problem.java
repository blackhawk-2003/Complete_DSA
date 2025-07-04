public class Matrix_Path_Problem {
    static int findPath(int n, int m) {
        if (n == 1 || m == 1) {
            return 1;
        }
        return findPath(n - 1, m) + findPath(n, m - 1);
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int n = matrix.length;
        int m = matrix[0].length;
        System.out.println(findPath(n, m));
    }
}
