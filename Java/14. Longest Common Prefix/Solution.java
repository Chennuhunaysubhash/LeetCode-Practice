class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }


        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {

                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String[] test1 = {"flower", "flow", "flight"};
        System.out.println(solution.longestCommonPrefix(test1)); // Output: "fl"

        String[] test2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(test2)); // Output: ""

        String[] test3 = {"interview", "internet", "internal"};
        System.out.println(solution.longestCommonPrefix(test3)); // Output: "inte"

        String[] test4 = {"apple", "ape", "april"};
        System.out.println(solution.longestCommonPrefix(test4)); // Output: "ap"

        String[] test5 = {"", "b", "c"};
        System.out.println(solution.longestCommonPrefix(test5)); // Output: ""

        String[] test6 = {"a"};
        System.out.println(solution.longestCommonPrefix(test6)); // Output: "a"
    }
}
