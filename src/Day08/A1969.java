package Day08;

import java.util.*;

/**
 * @author lemon
 * @date 2022/1/19 23:14
 * @blog www.lemonws.top
 */
public class A1969 {

    static int N = 1000010;
    static int[] pre = new int[N];

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Arrays.fill(pre, -50010);
        int n = in.nextInt();
        int k = in.nextInt();
        int res = -1;
        for (int i = 0; i < n; i++)
        {
            int id = in.nextInt();
            if(i - pre[id] <= k){
                res = Math.max(res, id);
            }
            pre[id] = i;
        }
        System.out.println(res);
    }
}
