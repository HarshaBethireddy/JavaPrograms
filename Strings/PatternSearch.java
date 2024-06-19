import java.util.regex.*;

// Tc ---> O(n), SC ---> O(1)

public class PatternSearch {
    public static void main(String[] args) {
        String inputString = "ababababab";
        String pattern = "ab";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(inputString);

        int count = 0;

        while (m.find()) {
            count++;
        }

        //int count = inputString.split(pattern, -1).length - 1;

        if (count > 0) {
            System.out.println("Pattern found in the string.");
            System.out.println("Number of occurrences: " + count);
        } else {
            System.out.println("Pattern not found in the string.");
        }
    }
}