package Day23;

import java.util.Scanner;

/**
 * @author DizzyLime
 * @date 2022/2/15 22:58
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class A1672 {

    public static void main(String[] args) {

        int res = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next(), b = sc.next();

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                int j = i + 1;
                while (j < n && a.charAt(j) != b.charAt(j)) j++;
                i = j;
                res++;
            }
        }

        System.out.println(res);
    }
}
