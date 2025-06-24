public class LearnRecursionBasic {
    public static void main(String[] args) {
        tree(3);
    }

    // static void fun(int n) {
    // if (n > 0) {
    // System.out.println(n);
    // fun(n - 1);
    // }
    // }
    // Linear Recursion
    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);

        }
    }

    // Tree Recursion
    static void tree(int n) {
        if (n > 0) {
            System.out.println(n);
            tree(n - 1);
            tree(n - 1);
        }
    }
}
