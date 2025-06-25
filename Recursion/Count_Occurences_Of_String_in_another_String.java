public class Count_Occurences_Of_String_in_another_String {
    static int countOccurences(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            return 1 + countOccurences(str.substring(sub.length()), sub);
        }
        return countOccurences(str.substring(1), sub);
    }

    public static void main(String[] args) {
        String str = "abababab";
        String sub = "ab";
        System.out.println(countOccurences(str, sub));
    }

}
