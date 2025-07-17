import java.util.ArrayList;
import java.util.List;

public class Letter_Combination_Of_A_Phone_Number {
    public static void main(String[] args) {
        String digits = "23";
        List<String> result = letterCombinations(digits);
        System.out.println(result);
    }

    private static void letterCombinations(String digits, int index, String[] map, String s, List<String> result) {
        if (index == digits.length()) {
            result.add(s);
            return;
        }
        for (int i = 0; i < map[digits.charAt(index) - '0'].length(); i++) {
            letterCombinations(digits, index + 1, map, s + map[digits.charAt(index) - '0'].charAt(i), result);
        }

    }

    private static List<String> letterCombinations(String digits) {
        String map[] = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        List<String> result = new ArrayList<>();
        letterCombinations(digits, 0, map, "", result);
        return result;

    }
}
