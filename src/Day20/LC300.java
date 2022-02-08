package Day20;

/**
 * @author DizzyLime
 * @date 2022/2/8 15:35
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class LC300 {

    static int N = 2505;
    static int[] dp = new int[N];

    public int lengthOfLIS(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
        }

        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res, dp[i]);
        }

        return res;
    }
}
