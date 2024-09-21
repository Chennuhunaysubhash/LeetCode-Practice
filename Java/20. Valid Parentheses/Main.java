public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.isValid("()")); // Output: true
        System.out.println(solution.isValid("()[]{}")); // Output: true
        System.out.println(solution.isValid("(]")); // Output: false
        System.out.println(solution.isValid("([])")); // Output: true
    }
}
