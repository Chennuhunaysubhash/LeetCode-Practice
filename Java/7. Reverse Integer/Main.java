public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.reverse(123));   // Output: 321
        System.out.println(solution.reverse(-123));  // Output: -321
        System.out.println(solution.reverse(120));   // Output: 21
        System.out.println(solution.reverse(0));     // Output: 0
    }
}
