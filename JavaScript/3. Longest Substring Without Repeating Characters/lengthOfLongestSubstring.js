function lengthOfLongestSubstring(s) {
    // Initialize the set to store characters in the current window
    let set = new Set();
    let left = 0, right = 0, maxLength = 0;

    // Iterate through the string with the right pointer
    while (right < s.length) {
        // If the character at the right pointer is not in the set, add it
        if (!set.has(s[right])) {
            set.add(s[right]);
            right++;
            // Update the maximum length
            maxLength = Math.max(maxLength, right - left);
        } else {
            // If the character is in the set, remove the character at the left pointer
            set.delete(s[left]);
            left++;
        }
    }

    return maxLength;
}

// Test cases
let s1 = "abcabcbb";
let s2 = "bbbbb";
let s3 = "pwwkew";

console.log(`Input: ${s1} -> Output: ${lengthOfLongestSubstring(s1)}`); // Output: 3
console.log(`Input: ${s2} -> Output: ${lengthOfLongestSubstring(s2)}`); // Output: 1
console.log(`Input: ${s3} -> Output: ${lengthOfLongestSubstring(s3)}`); // Output: 3
