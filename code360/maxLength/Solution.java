import java.util.*;

public class Solution {

    public static int maxLength(int[] arr) {
        int n = arr.length;
        int maxLen = 0;

        // Iterate over each possible starting point for the subarray
        for (int i = 0; i < n; i++) {
            Set<Integer> set = new HashSet<>();
            int minVal = arr[i];
            int maxVal = arr[i];

            // Try expanding the subarray from the starting point i
            for (int j = i; j < n; j++) {
                // If we encounter a duplicate, break the loop
                if (set.contains(arr[j])) {
                    break;
                }

                // Add the current element to the set
                set.add(arr[j]);

                // Update the minimum and maximum values in the subarray
                minVal = Math.min(minVal, arr[j]);
                maxVal = Math.max(maxVal, arr[j]);

                // Check if the current subarray forms a continuous sequence
                if (maxVal - minVal == j - i) {
                    // Update the maximum length of the continuous subarray
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases

        while (T-- > 0) {
            int N = sc.nextInt();  // Size of the array
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(maxLength(arr));
        }
    }
}
