public class Print_All_Subset_Of_A_Given_String {
    static void printAllSubsets(String str, String curr) {
        if (str.length() == 0) {
            System.out.println(curr);
            return;
        }
        printAllSubsets(str.substring(1), curr);
        printAllSubsets(str.substring(1), curr + str.charAt(0));
    }

    public static void main(String[] args) {
        String str = "abc";
        printAllSubsets(str, "");
    }
}
