
var romanToInt = function(s) {
    
    const romanMap = {
        'I': 1,
        'V': 5,
        'X': 10,
        'L': 50,
        'C': 100,
        'D': 500,
        'M': 1000
    };
    
    let total = 0;
    const length = s.length;
    
    for (let i = 0; i < length; i++) {
        let currentVal = romanMap[s.charAt(i)];
        let nextVal = i < length - 1 ? romanMap[s.charAt(i + 1)] : 0;

        // If the current value is less than the next value, subtract it; otherwise, add it
        if (currentVal < nextVal) {
            total -= currentVal;
        } else {
            total += currentVal;
        }
    }
    
    return total;
};

// Test cases
const testCases = ["III", "LVIII", "MCMXCIV", "IV", "XLII", "MMXXIV"];

testCases.forEach(test => {
    const result = romanToInt(test);
    console.log(`Roman: ${test} -> Integer: ${result}`);
});
