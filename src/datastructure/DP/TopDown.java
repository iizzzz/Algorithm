package src.datastructure.DP;

import java.util.Scanner;

/* DP 하향식 */
public class TopDown {
    static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1];
        System.out.println(fibonazzi(n));
    }

    // Top-down
    static int fibonazzi(int x) {
        if (x == 1 | x == 2) return 1;
        if (dp[x] != 0) return dp[x];

        dp[x] = fibonazzi(x-1) + fibonazzi(x-2);
        return dp[x];
    }
}
