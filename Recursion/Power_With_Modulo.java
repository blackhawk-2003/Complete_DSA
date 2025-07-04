public class Power_With_Modulo {
    public static void main(String[] args) {
        int x = 7;
        int n = 7;
        int m = 30;
        System.out.println(fastPower(x, n, m));
    }

    static double fastPower(double a, int b, int m) {
        if (b == 0) {
            return 1;
        }
        if (b < 0) {
            return fastPower(1 / a, Math.abs(b), m);
        }
        if (b % 2 == 0) {
            return fastPower((a % m * a % m) % m, b / 2, m);
        } else {
            return (a % m * fastPower(a, b - 1, m) % m) % m;
        }
    }

    static int power(int x, int n, int m) {
        if (n == 0) {
            return 1;
        }
        long temp = power(x, n / 2, m);
        temp = (temp * temp) % m;
        if (n % 2 == 0) {
            return (int) temp;
        }
        return (int) ((temp * x) % m);
    }
}
