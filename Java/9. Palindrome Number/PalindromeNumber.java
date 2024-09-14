public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x)); // Output: true

        x = -121;
        System.out.println(isPalindrome(x)); // Output: false

        x = 10;
        System.out.println(isPalindrome(x)); // Output: false
    }

    public static boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Create a reversed number
        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow
            if (reversed > (Integer.MAX_VALUE - digit) / 10) {
                return false;
            }

            reversed = reversed * 10 + digit;
        }

        // Compare the original number with the reversed number
        return original == reversed;
    }
}
