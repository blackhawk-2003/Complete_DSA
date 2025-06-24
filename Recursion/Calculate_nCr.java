public class Calculate_nCr {
    // nCr = n! / (r! * (n-r)!)
    static int nCr(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }

        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {
        System.out.println(nCr(5, 2));
    }
}
