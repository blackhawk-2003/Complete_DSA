public class Fibonacci_Number {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Fibonacci Number is a series of numbers where each number is the sum of the
    // two preceding ones, starting from 0 and 1.
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
