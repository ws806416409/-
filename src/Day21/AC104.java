package Day21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author DizzyLime
 * @date 2022/2/9 17:30
 * @blog https://lemonws.top
 * @github https://github.com/ws806416409
 */
public class AC104 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        a.sort(Comparator.naturalOrder());
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a.get(i) - a.get(i/2));
        }
        System.out.println(ans);
    }
}
