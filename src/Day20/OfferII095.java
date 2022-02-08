package Day20;

/**
 * @author DizzyLime
 * @date 2022/2/8 15:45
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class OfferII095 {

    static int N = 1005;
    static int[][] dp = new int[N][N];

    public int longestCommonSubsequence(String text1, String text2) {
        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
}
