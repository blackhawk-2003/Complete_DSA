public class Palindrome_String {
    static boolean isPalindrome(String str) {
        // Preprocess: remove non-alphanumeric and convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(str);
    }

    static boolean isPalindromeHelper(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindromeHelper(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }
}
