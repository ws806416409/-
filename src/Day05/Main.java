package Day05;

import java.util.*;

/**
 * @author lemon
 * @date 2022/1/5 21:23
 * @blog www.lemonws.top
 */
public class Main {
    static Scanner in = new Scanner(System.in);

    static int N = 100010;

    // 记录岛屿是否被淹没 1为淹没
    static int[] vis = new int[N];

    public static void main(String[] args) {
        // 优先队列 高度低的岛屿先出列
        PriorityQueue<Island> q = new PriorityQueue<>((Comparator.comparingInt(o -> o.high)));

        int n = in.nextInt();
        for (int i = 1; i <= n; i++)
            q.add(new Island(i, in.nextInt()));

        // vis[0]和vis[n+1]不使用 当作边界且默认被淹没
        vis[0] = 1;
        vis[n + 1] = 1;

        int waterHigh = 0;
        int ans = 1;
        int res = 1;
        while (!q.isEmpty()) {
            Island p = q.poll();

            if (p.high > waterHigh) {
                ans = Math.max(ans, res);
                waterHigh = p.high;
            }

            vis[p.idx] = 1;

            if (vis[p.idx - 1] == 0 && vis[p.idx + 1] == 0)
                res++;
            else if (vis[p.idx - 1] == 1 && vis[p.idx + 1] == 1)
                res--;
        }

        System.out.println(ans);
    }

    private static class Island{
        int idx;
        int high;

        public Island(int idx, int high)
        {
            this.idx = idx;
            this.high = high;
        }

    }

}
