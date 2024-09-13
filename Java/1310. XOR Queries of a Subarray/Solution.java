import java.util.Arrays;

public class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefixXOR = new int[n];
        prefixXOR[0] = arr[0];

        // Compute the prefix XOR array
        for (int i = 1; i < n; i++) {
            prefixXOR[i] = prefixXOR[i - 1] ^ arr[i];
        }

        int m = queries.length;
        int[] answer = new int[m];

        // Answer each query using the prefix XOR array
        for (int i = 0; i < m; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            if (left == 0) {
                answer[i] = prefixXOR[right];
            } else {
                answer[i] = prefixXOR[right] ^ prefixXOR[left - 1];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1, 3, 4, 8};
        int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        int[] result = solution.xorQueries(arr, queries);

        String arrayString = Arrays.toString(result).replace(" ", "");
        System.out.println(arrayString);


    }
}
