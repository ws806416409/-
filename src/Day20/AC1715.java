package Day20;

import java.util.Scanner;

/**
 * @author lemon
 * @date 2022/2/8 15:11
 * @blog www.lemonws.top
 */
public class AC1715 {

    static int N = 1005;
    static int[] tong = new int[N];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt(), r = sc.nextInt();
            int c = sc.nextInt();
            tong[l] += c;
            tong[r] -= c;
        }
        int sum = 0, ans = 0;
        for (int i = 0; i < N; i++) {
            sum += tong[i];
            ans = Math.max(sum, ans);
        }
        System.out.println(ans);
    }
}
