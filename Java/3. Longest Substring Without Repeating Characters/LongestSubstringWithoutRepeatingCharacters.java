import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        // Initialize the set to store characters in the current window
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        // Iterate through the string with the right pointer
        while (right < s.length()) {
            // If the character at the right pointer is not in the set, add it
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                // Update the maximum length
                maxLength = Math.max(maxLength, right - left);
            } else {
                // If the character is in the set, remove the character at the left pointer
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        // Test cases
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";

        System.out.println("Input: " + s1 + " -> Output: " + lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println("Input: " + s2 + " -> Output: " + lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println("Input: " + s3 + " -> Output: " + lengthOfLongestSubstring(s3)); // Output: 3
    }
}
