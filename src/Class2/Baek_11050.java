package Class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 11050 이항 계수 1 */
public class Baek_11050 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        dp = new int[a+1];
        dp[0]=1;
        dp[1]=1;
        System.out.println(factorial(a) / (factorial(a-b) * factorial(b)));
        br.close();
    }

    static int factorial(int n) {
        if (dp[n] != 0) {
            return dp[n];
        }
        return dp[n] = n * factorial(n-1);
    }
}
