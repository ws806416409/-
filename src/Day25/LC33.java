package Day25;

/**
 * @author DizzyLime
 * @date 2022/2/21 23:06
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class LC33 {
    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        else if (len == 1) return nums[0] == target ? 0 : -1;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = (l + r) >> 1;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[l]) {
                if (target < nums[mid] && target >= nums[l]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
