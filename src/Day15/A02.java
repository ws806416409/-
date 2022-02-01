package Day15;

import java.util.Scanner;

/**
 * @author lemon
 * @date 2022/2/1 17:23
 * @blog www.lemonws.top
 */
public class A02 {
    static int N = 1010;
    public static void main(String[] args) {
        int[] v = new int[N];
        int[] w = new int[N];
        int[] f = new int[N];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= v[i]; j--)
                f[j] = Math.max(f[j], f[j-v[i]] + w[i]);
        }
        System.out.println(f[m]);
    }
}
