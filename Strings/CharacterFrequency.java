import java.util.HashMap;
import java.util.Map;

// Tc ---> O(n), SC ---> O(k) (k is the number of unique characters in the string
public class CharacterFrequency {
    public static void main(String[] args) {
        String inputString = "ababababab";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}