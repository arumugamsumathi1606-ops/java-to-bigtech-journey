
import java.util.HashMap;
public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String longestSubString = "abcabcbb";
        String words = "";

        int maxLength = 0;
        int left = 0;

        for (int i = 0; i < longestSubString.length(); i++) {

            char ch = longestSubString.charAt(i);

            // Step 1: Check whether the character repeats inside the window
            if (map.containsKey(ch) && map.get(ch) >= left) {
                left = map.get(ch) + 1;
            }

            // Step 2: Store the character and its latest index
            map.put(ch, i);

            // Step 3: Calculate current window length
            int currentLength = i - left + 1;

            // Step 4: Update maximum length and substring
            if (currentLength > maxLength) {
                maxLength = currentLength;
                words = longestSubString.substring(left, i + 1);
            }
        }

        // Step 5: Print the result
        System.out.println("Longest Substring: " + words);
        System.out.println("Maximum Length: " + maxLength);
    }
}
