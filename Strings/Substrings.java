public class Substrings {
    public static void getSubstrings(String str) {
        for (int i = 0; i < str.length(); i++) {
            String subStr="";
            for (int j = i; j < str.length(); j++) {
                subStr += str.charAt(j);
                System.out.print(subStr +"\n");
            }
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        getSubstrings(str);
    }
}
