package Day16;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author lemon
 * @date 2022/2/2 10:30
 * @blog www.lemonws.top
 */
public class LC2099 {
    public int[] maxSubsequence(int[] nums, int k) {

        Elem[] elems = new Elem[nums.length];
        for (int i = 0; i < nums.length; i++) {
            elems[i] = new Elem(i, nums[i]);
        }
        Arrays.sort(elems, (o1, o2) -> o2.value - o1.value);

        Elem[] t = new Elem[k];
        System.arraycopy(elems, 0, t, 0, k);

        Arrays.sort(t, Comparator.comparingInt(o -> o.index));

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = t[i].value;
        }
        return ans;
    }

    class Elem{
        int index;
        int value;

        public Elem(int index, int value) {
            this.index = index;
            this.value = value;
        }
    }
}
