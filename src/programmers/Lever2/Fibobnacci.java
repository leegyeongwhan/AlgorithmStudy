package programmers.Lever2;

public class Fibobnacci {
    public int solution(int n) {
        // F(0) = 0, F(1) = 1일 때
        int[] dp = new int[100001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[n] % 1234567;
    }

    public static void main(String[] args) {
        Fibobnacci f = new Fibobnacci();
        System.out.println(f.solution(100000));
    }
}
