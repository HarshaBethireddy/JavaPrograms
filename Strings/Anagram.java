//TC --> O(n), SC --> O(1) (constant space)

public class Anagram {
    public static void main(String[] args) {
        System.out.println(areAnagrams("listen2", "2silent")); // true
        System.out.println(areAnagrams("hello", "world")); // false
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[36];
        for (int i = 0; i < s1.length(); i++) {
            int index1 = charToIndex(s1.charAt(i));
            int index2 = charToIndex(s2.charAt(i));
            if (index1 == -1 || index2 == -1) {
                return false; // Invalid character
            }
            count[index1]++;
            count[index2]--;
        }

        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    private static int charToIndex(char c) {
        if ('a' <= c && c <= 'z') {
            return c - 'a';
        } else if ('0' <= c && c <= '9') {
            return c - '0' + 26;
        } else {
            return -1; // Invalid character
        }
    }
}