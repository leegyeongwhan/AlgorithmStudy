package programmers.Lever2;

public class 멀리뛰기 {
    public long solution(int n) {
        long answer = 0;
        long[] dp = new long[2001];
        dp[1] = 1;
        dp[2] = 2;
        //       dp[3] = 3;
        //       dp[4] = 5;

        for(int i=3; i<2001; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }
}
