/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    // Handle the sign of the integer
    const sign = x < 0 ? -1 : 1;
    x = Math.abs(x);

    // Reverse the digits
    let reversed = 0;
    while (x > 0) {
        const digit = x % 10;
        reversed = reversed * 10 + digit;
        x = Math.floor(x / 10);
    }

    // Apply the sign
    reversed *= sign;

    // Ensure the reversed integer does not overflow
    if (reversed < Math.pow(-2, 31) || reversed > Math.pow(2, 31) - 1) {
        return 0;
    }

    return reversed;
};

// Example usage
console.log(reverse(123)); // Output: 321
console.log(reverse(-123)); // Output: -321
console.log(reverse(120)); // Output: 21
console.log(reverse(0)); // Output: 0

