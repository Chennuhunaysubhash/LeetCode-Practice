class Solution {
    public int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int pop = x % 10; // Get the last digit
            x /= 10; // Remove the last digit

            // Check for overflow/underflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0; // Overflow condition
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0; // Underflow condition
            }

            reversed = reversed * 10 + pop; // Update the reversed number
        }

        return reversed;
    }
}