package Day22;

import java.util.Scanner;

/**
 * @author DizzyLime
 * @date 2022/2/13 21:23
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class A1471 {

    static int N = 110;
    static boolean[][] g = new boolean[N][N];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            g[i][i] = true;
        }

        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            g[a][b] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    //如果j和i连通，i与k连通，那么j与k连通
                    if (g[j][i] && g[i][k]) g[j][k] = true;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            boolean flag = true;
            for (int j = 1; j <= n; j++) {
                if (!g[j][i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
