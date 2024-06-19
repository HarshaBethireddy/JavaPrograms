import java.util.ArrayList;
import java.util.List;

public class Subsequences {
    static List<String> subsequences = new ArrayList<>();
    public static void getSubsequences(String str, String ans) {
        if (str.length() == 0) {
            subsequences.add(ans);
            return;
        }
        getSubsequences(str.substring(1), ans + str.charAt(0));
        getSubsequences(str.substring(1), ans);
    }
    public static void main(String[] args) {
        String str = "abc";
        getSubsequences(str, "");
    }
}
