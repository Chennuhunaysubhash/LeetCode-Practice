public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String roman1 = "III";          // Expected output: 3
        String roman2 = "LVIII";        // Expected output: 58
        String roman3 = "MCMXCIV";      // Expected output: 1994

        // Run the tests
        System.out.println("Roman: " + roman1 + " -> Integer: " + solution.romanToInt(roman1));
        System.out.println("Roman: " + roman2 + " -> Integer: " + solution.romanToInt(roman2));
        System.out.println("Roman: " + roman3 + " -> Integer: " + solution.romanToInt(roman3));
    }
}
