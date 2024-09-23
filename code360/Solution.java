import java.util.* ;
import java.io.*;

public class Solution {
    public static int boringFactorials(int n, int p) {
        if (n >= p) {
            return 0;
        }
        long result = 1;
        for (int i = n + 1; i < p; i++) {
            result = (result * i) % p;
        }


        result = modInverse(result, p);
        return (int)((result * (p - 1)) % p);
    }
    public static long modInverse(long a, int p) {
        return power(a, p - 2, p);
    }

    public static long power(long a, int b, int p) {
        long result = 1;
        a = a % p;
        while (b > 0) {
            if ((b & 1) == 1) {
                result = (result * a) % p;
            }
            a = (a * a) % p;
            b >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage
        int n = 5;
        int p = 7;
        System.out.println(boringFactorials(n, p)); // Output should be 1
    }
}
