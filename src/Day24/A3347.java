package Day24;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @author DizzyLime
 * @date 2022/2/19 22:17
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class A3347 {

    static int N = 105;
    static int[] p = new int[N];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int res = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Double> hash = new HashSet<>();
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += p[j];
                hash.add((double)p[j]);
                double avg = (double) sum / (double)(j - i + 1);
                if (hash.contains(avg)) res++;
            }
        }
        System.out.println(res);
    }
}
