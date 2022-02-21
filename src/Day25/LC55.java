package Day25;

/**
 * @author DizzyLime
 * @date 2022/2/21 23:30
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class LC55 {
    int[] vis;
    boolean dfs(int[] nums, int idx) {
        vis[idx] = 1;
        if (idx >= nums.length - 1) return true;
        for (int i = 1; i <= nums[idx]; i++) {
            if (vis[idx + i] == 0) {
                if (dfs(nums, idx + i)) return true;
            }
        }
        return false;
    }

    public boolean canJump(int[] nums) {
        vis = new int[nums.length];
        return dfs(nums, 0);
    }
}
