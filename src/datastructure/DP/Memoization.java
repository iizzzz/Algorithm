package src.datastructure.DP;

/* DP Memoization */
public class Memoization {

    static int[] dp;

    /* 일반 재귀 함수
     - 중복된 계산을 반복해서 하게 된다.
     - 시간복잡도는 O(2^n)으로 x의 수가 커질수록 복잡도가 기하급수적으로 커진다.
     */
    static int fibonazzi(int x) {
        if (x == 1 | x == 2) return 1;
        return fibonazzi(x-1) + fibonazzi(x-2);
    }

    /* Memoization
     - 하위 문제의 결과 값을 dp[]배열에 저장해놓고 필요할 때마다 계산된 값을 호출한다.
    */
    static int memo(int x) {
        if (x == 1 | x == 2) return 1;
        if (dp[x] != 0) return dp[x];
        dp[x] = memo(x-1) + memo(x-2);
        return dp[x];
    }
}
