import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n = s.length();
        Set<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }

        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] + 1; // Assume s[i-1] is an extra character
            for (int j = 0; j < i; j++) {
                if (dictSet.contains(s.substring(j, i))) {
                    dp[i] = Math.min(dp[i], dp[j]);
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        String s1 = "applepie";
        String[] dictionary1 = {"apple", "pie"};
        System.out.println("Test case 1: " + solution.minExtraChar(s1, dictionary1)); // Output: 0

        // Test case 2
        String s2 = "applepeer";
        String[] dictionary2 = {"apple", "peer"};
        System.out.println("Test case 2: " + solution.minExtraChar(s2, dictionary2)); // Output: 0

        // Test case 3
        String s3 = "applepeach";
        String[] dictionary3 = {"apple", "peach"};
        System.out.println("Test case 3: " + solution.minExtraChar(s3, dictionary3)); // Output: 0

        // Test case 4
        String s4 = "applepeachpie";
        String[] dictionary4 = {"apple", "peach", "pie"};
        System.out.println("Test case 4: " + solution.minExtraChar(s4, dictionary4)); // Output: 0

        // Test case 5
        String s5 = "applepeachpie";
        String[] dictionary5 = {"apple", "peach"};
        System.out.println("Test case 5: " + solution.minExtraChar(s5, dictionary5)); // Output: 3 (for "pie")
    }
}
