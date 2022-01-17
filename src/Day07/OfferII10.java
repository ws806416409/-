package Day07;

//*
//* @author lemon
//* @date 2022/1/17 20:28
//* @blog www.lemonws.top


public class OfferII10 {
    static int[] dp = new int[105];
    static int mod = 1000000007;
    public int numWays(int n) {
        // if(n == 0) return 1;
        // else if (n < 0) return 0;
        // return numWays(n - 2)  + numWays(n - 1);
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] % mod + dp[i - 2] % mod;
        }
        return dp[n] % mod;
    }
}
