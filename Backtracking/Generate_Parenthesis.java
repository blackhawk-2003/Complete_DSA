import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }

    private static void generateParenthesis(int n, int open, int close, String s, List<String> result) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }
        if (open < n) {
            generateParenthesis(n, open + 1, close, s + "(", result);
            // backtrack
        }
        if (close < open) {
            generateParenthesis(n, open, close + 1, s + ")", result);

        }
        // there is no need of backtracking here because we are not modifying the same
        // string
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, 0, 0, "", result);
        return result;
    }

}
