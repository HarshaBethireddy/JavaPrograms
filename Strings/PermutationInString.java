import java.util.Arrays;

public class PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        int i = 0;
        int j = 0;
        int windowSize = s1.length();

        while (j < s2.length()) {
            if (j - i + 1 < windowSize) {
                s2Count[s2.charAt(j) - 'a']++;
                j++;
            } else if (j - i + 1 == windowSize) {
                // Calculations
                if (Arrays.equals(s1Count, s2Count)) {
                    return true;
                }
                s2Count[s2.charAt(j) - 'a']++;
                s2Count[s2.charAt(i) - 'a']--;
                i++;
                j++;
            }
        }

        return Arrays.equals(s1Count, s2Count);
    }

    public static void main(String[] args) {
        // Example usage:
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
    }
}
