function isValid(s) {
    const stack = [];
    
    for (let c of s) {
        if (c === '(' || c === '{' || c === '[') {
            stack.push(c);
        } else if (c === ')' || c === '}' || c === ']') {
            if (stack.length === 0) {
                return false;
            }
            const top = stack.pop();
            if ((c === ')' && top !== '(') ||
                (c === '}' && top !== '{') ||
                (c === ']' && top !== '[')) {
                return false;
            }
        }
    }
    
    return stack.length === 0;
}

// Example usage
console.log(isValid("()")); // Output: true
console.log(isValid("()[]{}")); // Output: true
console.log(isValid("(]")); // Output: false
console.log(isValid("([])")); // Output: true
console.log(isValid("([)]")); // Output: false
console.log(isValid("{[]}")); // Output: true
