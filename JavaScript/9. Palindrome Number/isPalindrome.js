function isPalindrome(x) {
    // Negative numbers are not palindromes
    if (x < 0) {
        return false;
    }

    // Create a reversed number
    let original = x;
    let reversed = 0;

    while (x !== 0) {
        let digit = x % 10;
        x = Math.floor(x / 10);

        // Check for overflow/underflow
        if (reversed > (Number.MAX_SAFE_INTEGER - digit) / 10) {
            return false;
        }

        reversed = reversed * 10 + digit;
    }

    // Compare the original number with the reversed number
    return original === reversed;
}

// Test cases
console.log(isPalindrome(121)); // Output: true
console.log(isPalindrome(-121)); // Output: false
console.log(isPalindrome(10)); // Output: false
