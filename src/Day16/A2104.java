package Day16;

import java.util.Arrays;

/**
 * @author lemon
 * @date 2022/2/2 10:00
 * @blog www.lemonws.top
 */
public class A2104 {
    public long subArrayRanges(int[] nums) {
        int len = nums.length;
        long res = 0;
        for (int i = 0; i < len; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = i; j < len; j++) {
                min = Math.min(min, nums[j]);
                max = Math.max(max, nums[j]);
                res += max - min;
            }
        }
        return res;
    }
}

