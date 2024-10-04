import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int total = 0;
        int length = s.length();

        // Normalize the input to uppercase to handle lowercase Roman numerals
        s = s.toUpperCase();

        for (int i = 0; i < length; i++) {
            // Get the current Roman numeral value from the map
            Integer currentVal = romanMap.get(s.charAt(i));

            if (currentVal == null) {
                // In case there's an invalid character, throw an exception
                throw new IllegalArgumentException("Invalid Roman numeral character: " + s.charAt(i));
            }

            // If current value is less than the next, subtract it; otherwise, add it
            if (i < length - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }
}
